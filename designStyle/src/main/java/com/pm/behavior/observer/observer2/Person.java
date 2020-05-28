package com.pm.behavior.observer.observer2;

/**
 * @author pengcheng
 * @version V1.0
 * @description 定义具体的观察者对象
 * @date 2019/04/03 17:03
 */
public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void update(float price) {
        System.out.println(name + "关注的杯子的价格已更新为：" + price);
    }
}
