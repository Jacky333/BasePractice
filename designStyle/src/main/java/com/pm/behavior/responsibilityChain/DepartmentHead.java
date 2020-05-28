package com.pm.behavior.responsibilityChain;

/**
 * @author pengcheng
 * @version V1.0
 * @description 系主任
 * @date 2019/03/26 17:25
 */
public class DepartmentHead extends Leader {
    public DepartmentHead(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        //小于7天系主任审批
        if (leaveNode.getNumber() <= 7) {
            System.out.println("系主任" + name + "审批" + leaveNode.getPerson() + "同学的请假条,请假天数为" + leaveNode.getNumber() + "天。");
        } else { //否则传递给院长
            if (this.successor != null) {
                this.successor.handleRequest(leaveNode);
            }
        }

    }
}
