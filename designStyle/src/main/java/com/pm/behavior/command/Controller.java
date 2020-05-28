package com.pm.behavior.command;

/**
 * @author pengcheng
 * @version V1.0
 * @description 遥控器类（发送类）
 * @date 2019/03/26 18:05
 */
public class Controller {
    private Command openTVCommand;
    private Command closeTVCommand;
    private Command changeChannelCommand;

    public Controller(Command openTvCommand, Command closeTvCommand, Command changeChannelCommand) {
        this.openTVCommand = openTvCommand;
        this.closeTVCommand = closeTvCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    /**
     * 打开电视机
     */
    public void open() {
        openTVCommand.execute();
    }

    /**
     * 关闭电视机
     */
    public void close() {
        closeTVCommand.execute();
    }

    /**
     * 换频道
     */
    public void change() {
        changeChannelCommand.execute();
    }

}
