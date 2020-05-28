package com.pm.spring.annotation.normal;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:25
 */
public class MyAnnotationTest {
    public static void main(String[] args) {
        if (AnnotationUse.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = (MyAnnotation) AnnotationUse.class.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.color());
            System.out.println(myAnnotation.value());
        } else {
            System.out.println("nothing");
        }
    }
}
