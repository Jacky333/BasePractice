package com.pm.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 游戏角色类
 * @date 2019/03/27 09:53
 */
@Data
@AllArgsConstructor
public class Role {
    private int bloodFlow;
    private int magicPoint;

    public void display() {
        System.out.println("用户当前状态:");
        System.out.println("血量:" + getBloodFlow() + ";蓝量:" + getMagicPoint());
    }

    /**
     * 保持存档、当前状态
     *
     * @return
     */
    public Memento saveMemento() {
        return new Memento(getBloodFlow(), getMagicPoint());
    }

    /**
     * 恢复存档
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
    }
}
