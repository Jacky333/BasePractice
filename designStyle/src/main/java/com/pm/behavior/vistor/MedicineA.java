package com.pm.behavior.vistor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体元素
 * @date 2019/04/03 17:56
 */
public class MedicineA extends Medicine {
    public MedicineA(String name,double price){
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);

    }
}
