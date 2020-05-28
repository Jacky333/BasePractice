package com.pm.behavior.observer.observer2;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/04/03 17:04
 */
public class Test {
    public static void main(String[] args) {
        //创建一个被观察者对象
        Cup doll  = new Cup(3000);
        //创建两个观察者对象
        Person p1 = new Person("商品-1");
        Person p2 = new Person("商品-2");
        //注册成为一个观察者
        doll.registerObserver(p1);
        doll.registerObserver(p2);

        System.out.println("第一轮促销：");
        // 价格变动
        doll.setPrice(2698);
        System.out.println("第二轮促销：");
        doll.setPrice(2299);
        System.out.println("第三轮促销：");
        doll.setPrice(1998);
        //将生命二号移除
        doll.removeObserver(p2);
        System.out.println("第四轮促销：");
        doll.setPrice(1098);

    }
}
