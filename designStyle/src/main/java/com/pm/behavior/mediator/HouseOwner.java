package com.pm.behavior.mediator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 房东（具体同事类）
 * @date 2019/03/27 09:06
 */
public class HouseOwner extends Person {
    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系
     * @param message
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("房主:" + name + ",获得信息：" + message);
    }
}
