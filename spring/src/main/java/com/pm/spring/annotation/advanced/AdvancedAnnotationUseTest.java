package com.pm.spring.annotation.advanced;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:06
 */
public class AdvancedAnnotationUseTest {
    public static void main(String[] args) {
        if (AdvancedAnnotationUse.class.isAnnotationPresent(AdvancedAnnotation.class)) {
            AdvancedAnnotation advancedAnnotation = (AdvancedAnnotation) AdvancedAnnotationUse.class.getAnnotation(AdvancedAnnotation.class);
            System.out.println("color:"+advancedAnnotation.color()+",value:"+advancedAnnotation.value()+",arrLength:"+advancedAnnotation.arrayAttr().length+",lamp:"+advancedAnnotation.lamp()+",annotationValue:"+advancedAnnotation.annotationAttr().value());
        }
    }
}
