package com.pm.structure.protoType.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Author: pengcheng
 * @Date: 2019/1/24 22:43
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Pig implements Cloneable {
    private String name;
    private Date birthDay;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthDay = (Date) pig.birthDay.clone();
        return pig;
    }
}
