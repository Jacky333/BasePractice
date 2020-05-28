package com.pm.behavior.vistor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体访问者：药房工作者
 * @date 2019/04/03 18:03
 */
public class WorkerOfPharmacy extends Visitor {
    @Override
    public void visitor(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void visitor(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
