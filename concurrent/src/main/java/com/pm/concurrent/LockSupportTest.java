package com.pm.concurrent;

import java.util.concurrent.locks.LockSupport;

/**
 * @author pengcheng
 * @version V1.0
 * @description LockSupport Demo
 * @date 2020/10/21 11:35
 */
public class LockSupportTest {
    public static void main(String[] args) {
        CarThread carThread = new CarThread();
        carThread.setName("劳斯劳斯");
        carThread.start();
        try {
            Thread.currentThread().sleep(2000);
            carThread.park();
            Thread.currentThread().sleep(2000);
            carThread.unPark();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class CarThread extends Thread {
        private boolean isStop = false;

        @Override
        public void run() {
            System.out.println(this.getName() + "正在行驶中");
            while (true) {
                if (isStop) {
                    System.out.println(this.getName() + "车停下来了");
                    //挂起当前线程
                    LockSupport.park();
                }
                System.out.println(this.getName() + "车还在正常跑");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        public void park() {
            isStop = true;
            System.out.println("停车啦，检查酒驾");
        }

        public void unPark() {
            isStop = false;
            //唤醒当前线程
            LockSupport.unpark(this);
            System.out.println("老哥你没酒驾，继续开吧");
        }
    }
}
