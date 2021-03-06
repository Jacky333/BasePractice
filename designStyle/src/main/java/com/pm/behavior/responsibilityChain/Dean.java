package com.pm.behavior.responsibilityChain;

/**
 * @author pengcheng
 * @version V1.0
 * @description 院长
 * @date 2019/03/26 17:29
 */
public class Dean extends Leader {
    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        //小于10天院长审批
        if (leaveNode.getNumber() <= 10) {
            System.out.println("院长" + name + "审批" + leaveNode.getPerson() + "同学的请假条,请假天数为" + leaveNode.getNumber() + "天。");
        } else { //否则传递给校长
            if (this.successor != null) {
                this.successor.handleRequest(leaveNode);
            }
        }

    }
}
