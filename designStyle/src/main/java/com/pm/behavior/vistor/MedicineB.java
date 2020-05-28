package com.pm.behavior.vistor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体元素
 * @date 2019/04/03 17:58
 */
public class MedicineB extends Medicine{
    public MedicineB(String name,double price){
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
