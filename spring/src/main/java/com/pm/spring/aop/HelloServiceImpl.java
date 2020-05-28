package com.pm.spring.aop;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 20:20
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world");
    }
}
