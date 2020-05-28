package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 电视机类（请求接收者）
 * @date 2019/03/26 18:03
 */
public class Television {
    public void open(){
        System.out.println("打开电视机......");
    }
    public void close(){
        System.out.println("关闭电视机.......");
    }
    public void changeChannel(){
        System.out.println("切换频道......");
    }
}
