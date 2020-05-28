package com.pm.behavior.mediator;

import lombok.AllArgsConstructor;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象同事类
 * @date 2019/03/27 09:04
 */
@AllArgsConstructor
public abstract class Person {
    protected String name;
    protected Mediator mediator;
}
