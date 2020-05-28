package com.pm.create.factory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 实体工厂类
 * @date 2019/04/09 09:13
 */
public class SquareFactory extends AbstractFactory {
    @Override
    public Shape getCircle() {
        return null;
    }

    @Override
    public Shape getRectangle() {
        return null;
    }

    @Override
    public Shape getSquare() {
        return new Square();
    }
}
