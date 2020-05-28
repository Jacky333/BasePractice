package com.pm.structure.protoType;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: pengcheng
 * @Date: 2019/1/24 21:35
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;
    public Mail(){
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone object");
        return super.clone();
    }
}
