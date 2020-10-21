package com.pm.concurrent;

/**
 * @author pengcheng
 * @version V1.0
 * @description 假设有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行
 * 可以使用join方法解决这个问题。比如在线程A中，调用线程B的join方法表示的意思就是：
 * A等待B线程执行完毕后（释放CPU执行权），在继续执行。
 * @date 2020/10/21 11:20
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread spring = new Thread(new SeasonThreadTask("春天"));
        Thread summer = new Thread(new SeasonThreadTask("夏天"));
        Thread autumn = new Thread(new SeasonThreadTask("秋天"));

        try {
            //春天线程先启动
            spring.start();
            //主线程等待线程spring执行完，再往下执行
            spring.join();
            //夏天线程再启动
            summer.start();
            //主线程等待线程summer执行完，再往下执行
            summer.join();
            //秋天线程最后启动
            autumn.start();
            //主线程等待线程autumn执行完，再往下执行
            autumn.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class SeasonThreadTask implements Runnable {
        private String name;

        public SeasonThreadTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i < 4; i++) {
                System.out.println(this.name + "来了:" + i + "次");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
