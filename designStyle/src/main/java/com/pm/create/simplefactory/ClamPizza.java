package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体产品类
 * @date 2019/04/08 20:10
 */
public class ClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare ClamPizza ...");
    }

    @Override
    public void bake() {
        System.out.println("bake ClamPizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut ClamPizza ...");
    }

    @Override
    public void box() {
        System.out.println("box ClamPizza ...");
    }
}
