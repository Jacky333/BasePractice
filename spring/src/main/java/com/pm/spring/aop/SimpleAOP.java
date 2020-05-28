package com.pm.spring.aop;

import java.lang.reflect.Proxy;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 20:17
 */
public class SimpleAOP {
    public static Object getProxy(Object bean,Advice advice){
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(),bean.getClass().getInterfaces(),advice);
    }
}
