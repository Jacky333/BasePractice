package com.pm.jvm;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/02/23 17:02
 */
public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(60000);
        while (true) {
            loadData();
        }
    }

    private static void loadData() throws InterruptedException {
        byte[] data = null;
        for (int i = 0; i < 4; i++) {
            data = new byte[10 * 1024 * 1024];
        }
        data = null;

        byte[] data1 = new byte[10 * 1024 * 1024];
        byte[] data2 = new byte[10 * 1024 * 1024];

        byte[] data3 = new byte[10 * 1024 * 1024];
        data3 = new byte[10 * 1024 * 1024];


        Thread.sleep(1000);
    }
}
