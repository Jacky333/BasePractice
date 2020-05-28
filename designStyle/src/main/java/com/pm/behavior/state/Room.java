package com.pm.behavior.state;

import lombok.Data;

/**
 * @author pengcheng
 * @version V1.0
 * @description 房间类
 * @date 2019/03/26 16:19
 */
@Data
public class Room {

    /**
     * 空闲状态
     */
    State freeTimeState;
    /**
     * 入住状态
     */
    State checkInState;
    /**
     * 预订状态
     */
    State bookedState;

    State state;

    public Room() {
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        //初始状态为空闲
        state = freeTimeState;
    }

    /**
     * 预订房间
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * 退订房间
     */
    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    /**
     * 入住
     */
    public void checkInRoom() {
        state.checkInRoom();
    }

    /**
     * 退房
     */
    public void checkOutRoom() {
        state.checkOutRoom();
    }

    @Override
    public String toString() {
        return "该房间的状态是" + getState().getClass().getName();
    }

}
