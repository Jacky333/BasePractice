package com.pm.create.abastractfactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 实体工厂
 * @date 2019/04/09 09:45
 */
public class RedFactory implements ShapeFactory {
    public Circle getCircle() {
        return new RedCircle();
    }

    public Square getSquare() {
        return new RedSquare();
    }
}
