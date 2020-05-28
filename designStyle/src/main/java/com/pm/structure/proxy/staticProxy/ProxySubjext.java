package com.pm.structure.proxy.staticProxy;

/**
 * @Author: pengcheng
 * @Date: 2018/12/7 0007
 * @Version 1.0
 */
public class ProxySubjext implements Subject {
    private Subject subject;

    public ProxySubjext(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        subject.buyHouse();
        System.out.println("买房后装修");
    }
}
