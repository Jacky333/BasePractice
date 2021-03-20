package com.pm.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/11/17 15:22
 */
public class RedisTest {
    private static Integer inventory = 1001;
    private static final int NUM = 1000;
    private static LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue<>();
    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(inventory, inventory, 10L, TimeUnit.SECONDS, linkedBlockingQueue);
        final CountDownLatch countDownLatch = new CountDownLatch(NUM);
        long start = System.currentTimeMillis();
        for (int i = 0; i <= NUM; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        reentrantLock.lock();
                        inventory--;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        reentrantLock.unlock();
                    }
                    System.out.println("线程执行:" + Thread.currentThread().getName());
                    countDownLatch.countDown();
                }
            });
        }
        threadPoolExecutor.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("执行线程数:" + NUM + "  总耗时:" + (end - start) + "库存数为" + inventory);
    }
}
