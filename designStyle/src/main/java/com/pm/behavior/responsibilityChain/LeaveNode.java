package com.pm.behavior.responsibilityChain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 请假条
 * @date 2019/03/26 17:05
 */
@Data
@AllArgsConstructor
public class LeaveNode {

    /**
     * 请假人
     */
    private String person;
    /**
     * 请假天数
     */
    private int number;

}
