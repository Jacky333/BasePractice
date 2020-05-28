package com.pm.structure.proxy.cglibProxy;

/**
 * @Author: pengcheng
 * @Date: 2018/12/9
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        //目标对象
        UserDao target=new UserDao();
        //代理对象
        UserDao proxy=(UserDao) new ProxyFactory(target).getProxyInstace();
        //执行代理对象的方法
        proxy.save();
    }
}
