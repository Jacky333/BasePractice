package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 关闭电视机的按钮
 * @date 2019/03/26 18:09
 */
public class CloseTvCommand implements Command {
    private Television tv;

    public CloseTvCommand() {
        tv = new Television();
    }

    public void execute() {
        tv.close();
    }
}
