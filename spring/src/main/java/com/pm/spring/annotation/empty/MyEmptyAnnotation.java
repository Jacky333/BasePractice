package com.pm.spring.annotation.empty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author pengcheng
 * @version V1.0
 * @description 空注解
 * @date 2020/05/11 18:58
 */

/**
 *  *
 *   * @Retention(RetentionPolicy.SOURCE)
 *   * 这个注解的意思是让MyAnnotation注解只在java源文件中存在，编译成.class文件后注解就不存在了
 *   * @Retention(RetentionPolicy.CLASS)
 *   * 这个注解的意思是让MyAnnotation注解在java源文件(.java文件)中存在，编译成.class文件后注解也还存在，
 *   * 被MyAnnotation注解类标识的类被类加载器加载到内存中后MyAnnotation注解就不存在了
 */
//Retention注解决定MyAnnotation注解的生命周期
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyEmptyAnnotation {
}
