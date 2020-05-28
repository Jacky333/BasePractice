package com.pm.create.singleton;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/05/14 19:58
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);

        Singleton2 instance = Singleton2.INSTANCE;
        Singleton2 instance2 = Singleton2.INSTANCE;
        System.out.println(instance == instance2);
    }
}
