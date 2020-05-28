package com.pm.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description  备完录
 * @date 2019/03/27 09:55
 */
@Data
@AllArgsConstructor
public class Memento {
    private int bloodFlow;
    private int magicPoint;
}
