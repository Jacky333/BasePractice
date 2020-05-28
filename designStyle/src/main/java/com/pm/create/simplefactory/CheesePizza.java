package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体产品类
 * @date 2019/04/08 20:08
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare CheesePizza ...");
    }

    @Override
    public void bake() {
        System.out.println("bake CheesePizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut CheesePizza ...");
    }

    @Override
    public void box() {
        System.out.println("box CheesePizza ...");
    }
}
