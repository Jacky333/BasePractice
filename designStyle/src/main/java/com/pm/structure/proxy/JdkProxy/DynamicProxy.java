package com.pm.structure.proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: pengcheng
 * @Date: 2018/12/7 0007
 * @Version 1.0
 */
public class DynamicProxy  implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object){
        this.object=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(object,args);
        return result;
    }
}
