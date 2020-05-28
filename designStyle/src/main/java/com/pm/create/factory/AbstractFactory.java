package com.pm.create.factory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象工厂
 * @date 2019/04/09 09:10
 */
public abstract class AbstractFactory {
    public abstract Shape getCircle();

    public abstract Shape getRectangle();

    public abstract Shape getSquare();
}
