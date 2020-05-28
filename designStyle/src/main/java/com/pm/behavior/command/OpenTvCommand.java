package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 开的按钮
 * @date 2019/03/26 18:06
 */
public class OpenTvCommand implements Command {
    private Television tv;

    public OpenTvCommand() {
        tv = new Television();
    }

    public void execute() {
        tv.open();
    }
}
