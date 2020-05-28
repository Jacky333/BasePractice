package com.pm.create.abastractfactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/04/09 09:48
 */
public class FactoryDemo {
    public static void main(String[] args) {
        //获取blue工厂
        ShapeFactory factory = new BlueFactory();
        //通过blue工厂获取Circle、Square对象
        Circle circle = factory.getCircle();
        Square square = factory.getSquare();
        //调用Circle、Square对象的draw()方法
        circle.draw();
        square.draw();
        System.out.println("-----------------------------");
        //获取red工厂
        ShapeFactory factory2 = new RedFactory();
        //通过red工厂获取Circle、Square对象
        Circle circle2 = factory2.getCircle();
        Square square2 = factory2.getSquare();
        //调用Circle、Square对象的draw()方法
        circle2.draw();
        square2.draw();
    }
}
