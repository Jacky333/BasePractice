package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体产品类
 * @date 2019/04/08 20:12
 */
public class PepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare PepperoniPizza ...");
    }

    @Override
    public void bake() {
        System.out.println("bake PepperoniPizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut PepperoniPizza ...");
    }

    @Override
    public void box() {
        System.out.println("box PepperoniPizza ...");
    }
}
