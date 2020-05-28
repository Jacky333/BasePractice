package com.pm.create.abastractfactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 实体工厂
 * @date 2019/04/09 09:47
 */
public class BlueFactory implements ShapeFactory {
    public Circle getCircle() {
        return new BlueCircle();
    }

    public Square getSquare() {
        return new BlueSquare();
    }
}
