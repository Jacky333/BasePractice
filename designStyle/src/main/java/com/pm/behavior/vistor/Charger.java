package com.pm.behavior.vistor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体访问者：划价员
 * @date 2019/04/03 18:01
 */
public class Charger extends Visitor {
    @Override
    public void visitor(MedicineA a) {
        System.out.println("划价员：" + name + "给药" + a.getName() + "划价:" + a.getPrice());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("划价员：" + name + "给药" + b.getName() + "划价:" + b.getPrice());
    }
}
