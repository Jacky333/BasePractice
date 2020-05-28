package com.pm.behavior.vistor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象元素
 * @date 2019/04/03 17:55
 */
@AllArgsConstructor
@Data
public abstract class Medicine {
    protected String name;
    protected double price;

    public abstract void accept(Visitor visitor);
}
