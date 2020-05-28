package com.pm.spring.annotation.advanced;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:37
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface AdvancedAnnotation {
    String color() default "blue";//为属性指定缺省值

    String value();//定义一个名称为value的属性

    //添加一个int类型数组的属性
    int[] arrayAttr() default {1, 2, 4};

    //添加一个枚举类型的属性，并指定枚举属性的缺省值，缺省值只能从枚举类EumTrafficLamp中定义的枚举对象中取出任意一个作为缺省值
    EumTrafficLamp lamp() default EumTrafficLamp.RED;

    //为注解添加一个注解类型的属性,并指定注解属性的缺省值
    MetaAnnotation annotationAttr() default @MetaAnnotation("xdp");
}
