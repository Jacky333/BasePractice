package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 客户端
 * @date 2019/03/26 18:13
 */
public class Client {
    public static void main(String[] args) {
        Command openCommand, closeCommand, changeCommand;

        openCommand = new OpenTvCommand();
        closeCommand = new CloseTvCommand();
        changeCommand = new ChangeChannelCommand();

        Controller control = new Controller(openCommand, closeCommand, changeCommand);
        control.open();
        control.change();
        control.close();
    }
}
