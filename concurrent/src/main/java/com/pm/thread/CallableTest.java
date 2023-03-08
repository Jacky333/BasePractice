package com.pm.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/03/13 14:25
 */
public class CallableTest implements Callable {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<String>(new CallableTest());
        new Thread(futureTask).start();

        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object call() throws Exception {
        return "Hello, World";
    }

}
