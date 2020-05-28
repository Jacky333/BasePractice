package com.pm.structure.protoType.clone;

import java.util.Date;

/**
 * @Author: pengcheng
 * @Date: 2019/1/24 22:44
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig1=new Pig("佩奇",new Date(0L));
        Pig pig2=(Pig)pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

//        pig1.setBirthDay(new Date(6666666666666L));
        pig1.getBirthDay().setTime(6666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);


    }
}
