package com.pm.behavior.state;

/**
 * @author pengcheng
 * @version V1.0
 * @description 状态接口
 * @date 2019/03/26 16:13
 */
public interface State {
    /**
     * 预定房间
     */
    public void bookRoom();

    /**
     * 退订房间
     */
    public void unsubscribeRoom();

    /**
     * 入住
     */
    public void checkInRoom();

    /**
     * 退房
     */
    public void checkOutRoom();
}
