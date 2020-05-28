package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 专门用于创建披萨的工厂类
 * @date 2019/04/08 20:13
 */
public class SimplePizzaFactory {
    public Pizza create(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
