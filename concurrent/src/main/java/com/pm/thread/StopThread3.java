package com.pm.thread;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/03/12 18:25
 */
public class StopThread3 {
    public static void main(String[] args) throws InterruptedException {
        HelloThread2 t = new HelloThread2();
        t.start();
        Thread.sleep(1);
        t.running = false; // 标志位置为false
    }
}

class HelloThread2 extends Thread {
    public volatile boolean running = true;

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}

