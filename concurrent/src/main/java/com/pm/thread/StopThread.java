package com.pm.thread;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/03/12 16:08
 */
public class StopThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }


}

class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello");
        }
    }
}