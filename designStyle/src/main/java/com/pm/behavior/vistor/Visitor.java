package com.pm.behavior.vistor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象访问者
 * @date 2019/04/03 17:53
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visitor(MedicineA a);

    public abstract void visitor(MedicineB b);
}
