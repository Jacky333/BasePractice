package com.pm.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author pengcheng
 */
public class ExchangerTest {
    private static final Exchanger<String> exgr = new Exchanger<String>();
    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);
    public static void main(String[] args) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String A = "银⾏行行流⽔水A"; // A录⼊入银⾏行行流⽔水数据
                    exgr.exchange(A);
                } catch (InterruptedException e) {
                }
            }
        });
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String B = "银⾏行行流⽔水B"; // B录⼊入银⾏行行流⽔水数据
                    String A = exgr.exchange("B");
                    System.out.println("A和B数据是否⼀一致：" + A.equals(B) + "，A录⼊入的是："
                            + A + "，B录⼊入是：" + B);
                } catch (InterruptedException e) {
                }
            }
        });
        threadPool.shutdown();
    }
}
