package com.pm.spring.annotation.normal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:18
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyAnnotation {
    String color() default "blue";
    String value();
}
