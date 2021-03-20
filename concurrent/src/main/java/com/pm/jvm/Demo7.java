package com.pm.jvm;

import java.util.ArrayList;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2021/02/23 17:02
 */
public class Demo7 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Data> datas = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            datas.add(new Data());
        }
        Thread.sleep(1 * 60 * 60 * 1000);
    }

    static class Data {

    }
}
