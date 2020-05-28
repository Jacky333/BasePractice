package com.pm.create.clonable;

import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 浅度克隆
 * @date 2019/04/22 11:43
 */
@Data
public class Student implements Cloneable{
    private int number;

    private Score score;

    @Override
    public Object clone() {
        Student stu = null;
        try{
            stu = (Student)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}
