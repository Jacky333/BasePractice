package com.pm.concurrent.executeinorder;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/03/08 17:44
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("开发人员开发新需求功能");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        System.out.println("产品经理来上班了...");
        System.out.println("开发人员来上班了...");
        thread2.start();
        thread1.start();
        thread3.start();
    }
}
