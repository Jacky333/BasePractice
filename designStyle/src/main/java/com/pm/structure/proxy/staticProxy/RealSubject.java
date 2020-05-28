package com.pm.structure.proxy.staticProxy;

/**
 * @Author: pengcheng
 * @Date: 2018/12/7 0007
 * @Version 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void buyHouse() {
        System.out.println("买房子");
    }
}
