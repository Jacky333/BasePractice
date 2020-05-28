package com.pm.behavior.responsibilityChain;

/**
 * @author pengcheng
 * @version V1.0
 * @description 抽象处理者
 * @date 2019/03/26 17:07
 */
public abstract class Leader {
    /**
     * 姓名
     */
    public String name;

    /**
     * 后继者
     */
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNode leaveNode);
}
