package com.pm.structure.proxy.reflect;

import lombok.Data;

/**
 * @Author:
 * @Date:
 * @Version
 */
@Data
public class Student {
    private String name;
    private int age;
    public Student(String name){
        this.name=name;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
