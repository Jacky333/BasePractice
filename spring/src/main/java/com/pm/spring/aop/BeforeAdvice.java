package com.pm.spring.aop;

import java.lang.reflect.Method;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 19:57
 */
public class BeforeAdvice implements Advice {
    private Object bean;
    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在目标方法执行前调用通知
        methodInvocation.invoke();
        return method.invoke(bean,args);
    }
}
