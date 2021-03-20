package com.pm.jvm;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/02/23 17:02
 */
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        while (true) {
            loadData();
        }
    }

    private static void loadData() throws InterruptedException {
        byte[] data = null;
        for (int i = 0; i < 50; i++) {
            data = new byte[100 * 1024];
        }
        data = null;

        Thread.sleep(1000);
    }
}
