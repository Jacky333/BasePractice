package com.pm.create.simplefactory;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象产品类
 * @date 2019/04/08 20:06
 */
public abstract class Pizza {
    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
