package com.pm.spring.annotation.advanced;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2020/05/11 19:05
 */
@AdvancedAnnotation(color = "red",
        value = "jacky",
        arrayAttr = {3, 5, 6},
        lamp = EumTrafficLamp.GREEN,
        annotationAttr = @MetaAnnotation("cheung"))
public class AdvancedAnnotationUse {
}
