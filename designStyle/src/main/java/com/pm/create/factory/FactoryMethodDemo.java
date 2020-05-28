package com.pm.create.factory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/04/09 09:22
 * 一个产品抽象类，可以派生出多个产品实体类。
 * 一个工厂抽象类，可以派生出多个工厂实体类。
 * 每个工厂实体类只能创建一个产品实体类的实例。
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        AbstractFactory factory = new CircleFactory();
        AbstractFactory factory2 = new RectangleFactory();
        AbstractFactory factory3 = new SquareFactory();
        //获取Circle的对象
        Shape shape1 = factory.getCircle();
        //获取Rectangle的对象
        Shape shape2 = factory2.getRectangle();
        //获取Square的对象
        Shape shape3 = factory3.getSquare();
        //分别调用Circle、Rectangle、Square对象的draw()方法
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
