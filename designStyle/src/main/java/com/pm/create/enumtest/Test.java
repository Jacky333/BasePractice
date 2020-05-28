package com.pm.create.enumtest;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/05/14 20:14
 */
public class Test {
    public static void main(String[] args) {
        for (EnumTest e : EnumTest.values()) {
            System.out.println(e.toString());
            System.out.println();
        }
        System.out.println("----------------我是分隔线------------------");
        EnumTest test = EnumTest.TUE;
        switch (test) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            // ... ...
            default:
                System.out.println(test);
                break;
        }
        //getDeclaringClass()
        System.out.println("getDeclaringClass(): " + test.getDeclaringClass().getName());

        //name() 和  toString()
        System.out.println("name(): " + test.name());
        System.out.println("toString(): " + test.toString());

        //ordinal()， 返回值是从 0 开始
        System.out.println("ordinal(): " + test.ordinal());
    }
}
