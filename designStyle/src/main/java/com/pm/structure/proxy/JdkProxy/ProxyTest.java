package com.pm.structure.proxy.JdkProxy;


import com.pm.structure.proxy.staticProxy.RealSubject;
import com.pm.structure.proxy.staticProxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @Author: pengcheng
 * @Date: 2018/12/7 0007
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Subject realSubject=new RealSubject();
        DynamicProxy proxy=new DynamicProxy(realSubject);
        ClassLoader classLoader=realSubject.getClass().getClassLoader();
        Subject subject=(Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},proxy);
        System.out.println("买房前准备");
        subject.buyHouse();
        System.out.println("买房后装修");
    }
}
