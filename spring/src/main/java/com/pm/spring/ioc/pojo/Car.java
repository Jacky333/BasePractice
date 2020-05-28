package com.pm.spring.ioc.pojo;

import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 17:08
 */
@Data
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;
}
