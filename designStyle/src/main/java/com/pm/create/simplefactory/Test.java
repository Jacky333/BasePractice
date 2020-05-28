package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/04/08 20:20
 */
public class Test {
    public static void main(String[] args) {
        Pizza pizza = new SimplePizzaFactory().create("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
