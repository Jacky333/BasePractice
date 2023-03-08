package com.pm.thread;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/03/12 16:08
 * join 使用的场景：在很多情况下，主线程创建并启动子线程，如果子线程中要进行大量的耗时运算，主线程将可能早于子线程结束。
 * 如果主线程需要知道子线程的执行结果时，就需要等待子线程执行结束了。主线程可以sleep(xx),但这样的xx时间不好确定，因为子线程的执行时间不确定，join()方法比较合适这个场景。
 *
 */
public class StopThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
//        t.join();
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