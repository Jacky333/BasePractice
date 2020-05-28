package com.pm.spring.aop;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 20:21
 */
public class SimpleAOPTest {
    public static void main(String[] args) {
        //1.创建一个MethodInvocation类
        MethodInvocation logTask = new MethodInvocation() {
            @Override
            public void invoke() {
                System.out.println("log task start");
            }
        };
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        //2.创建一个Advice
        BeforeAdvice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        //3.为目标对象生成代理
        HelloService helloServiceImplProxy =(HelloService)SimpleAOP.getProxy(helloServiceImpl,beforeAdvice);
        helloServiceImplProxy.sayHelloWorld();

    }
}
