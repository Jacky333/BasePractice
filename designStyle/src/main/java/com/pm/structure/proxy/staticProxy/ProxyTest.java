package com.pm.structure.proxy.staticProxy;

/**
 * @Author: pengcheng
 * @Date: 2018/12/7 0007
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxySubjext proxySubjext =new ProxySubjext(new RealSubject());
        proxySubjext.buyHouse();
    }
}
