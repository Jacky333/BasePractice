package com.pm.behavior.mediator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 租客
 * @date 2019/03/27 09:12
 */
public class Tenant extends Person {
    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系
     *
     * @param message
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     *
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("租房者:" + name + ",获得信息：" + message);
    }
}
