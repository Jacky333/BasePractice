package com.pm.behavior.responsibilityChain;

/**
 * @author pengcheng
 * @version V1.0
 * @description 客户端
 * @date 2019/03/26 17:34
 */
public class Client {
    public static void main(String[] args) {
        //辅导员
        Leader instructor = new Instructor("陈毅");
        //系主任
        Leader departmentHead = new DepartmentHead("王明");
        //院长
        Leader dean = new Dean("张强");
        //校长
        Leader president = new President("王晗");

        instructor.setSuccessor(departmentHead);
        departmentHead.setSuccessor(dean);
        dean.setSuccessor(president);

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三",2);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四",9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五",15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六",20);
        instructor.handleRequest(leaveNode4);




    }
}
