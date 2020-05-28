package com.pm.spring.annotation.empty;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:06
 */
public class EmptyAnnotationUseTest {
    public static void main(String[] args) {
        if (EmptyAnnotationUse.class.isAnnotationPresent(MyEmptyAnnotation.class)) {
            MyEmptyAnnotation annotation = (MyEmptyAnnotation) EmptyAnnotationUse.class.getAnnotation(MyEmptyAnnotation.class);
            System.out.println(annotation);
        }else {
            System.out.println("nothing");
        }
    }
}
