package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体产品类
 * @date 2019/04/08 20:12
 */
public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizza ...");
    }

    @Override
    public void bake() {
        System.out.println("bake VeggiePizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizza ...");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizza ...");
    }
}
