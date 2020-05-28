package com.pm.behavior.mediator;

import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 具体中介者
 * @date 2019/03/27 09:15
 */
@Data
public class MediatorStructure extends Mediator {
    /**
     * 首先中介结构必须知道所有房主和租房者的信息
     */
    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
