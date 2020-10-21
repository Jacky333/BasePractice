package com.pm.concurrent;

import java.util.concurrent.*;

/**
 * @author pengcheng
 * @version V1.0
 * @description Callable Demo
 * @date 2020/10/21 10:41
 */
public class CallableRunnableTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<String> futureCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "你好，callable";
            }
        };

        Future<String> future = executorService.submit(futureCallable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("你好，runnable");
            }
        };
        Future<?> futureRunnable = executorService.submit(runnable);
        try {
            System.out.println(futureRunnable.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
