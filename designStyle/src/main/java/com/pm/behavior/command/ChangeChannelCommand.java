package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 换台的按钮
 * @date 2019/03/26 18:07
 */
public class ChangeChannelCommand implements Command {
    private Television tv;

    public ChangeChannelCommand() {
        tv = new Television();
    }

    public void execute() {
        tv.changeChannel();
    }
}
