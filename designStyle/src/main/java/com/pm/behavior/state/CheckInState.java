package com.pm.behavior.state;

/**
 * @author pengcheng
 * @version V1.0
 * @description 入住可以退房
 * @date 2019/03/26 16:18
 */
public class CheckInState implements State {
    Room hotelManagement;

    public CheckInState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    public void unsubscribeRoom() {
        //不需要做操作
    }

    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    public void checkOutRoom() {
        System.out.println("退房成功....");
        //状态变成空闲
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }
}
