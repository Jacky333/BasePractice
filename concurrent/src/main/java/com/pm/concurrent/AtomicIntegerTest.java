package com.pm.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pengcheng
 * @version V1.0
 * @description AtomicIntegerDemo
 * @date 2020/10/20 20:24
 */
public class AtomicIntegerTest {
    private static AtomicInteger atomicInteger =new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        testAdd();
    }

    private static void testAdd() throws InterruptedException {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i <1000 ; i++) {
            executorService.execute(() -> {
                for (int j = 0; j <2 ; j++) {
                    //自增并返回当前值
                    int andIncrement = atomicInteger.incrementAndGet();
                    System.out.println("线程:" + Thread.currentThread().getName() + " count=" + andIncrement);
                }
            });
        }
        executorService.shutdown();
        Thread.sleep(100);
        System.out.println("最终结果是 ：" + atomicInteger.get());
    }
}
