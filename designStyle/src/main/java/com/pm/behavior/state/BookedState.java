package com.pm.behavior.state;

/**
 * @author pengcheng
 * @version V1.0
 * @description 入住状态房间只能退房
 * @date 2019/03/26 16:17
 */
public class BookedState implements State {
    Room hotelManagement;

    public BookedState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    public void unsubscribeRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        //变成空闲状态
        hotelManagement.setState(hotelManagement.getFreeTimeState());
    }

    public void checkInRoom() {
        System.out.println("入住成功...");
        //状态变成入住
        hotelManagement.setState(hotelManagement.getCheckInState());

    }

    public void checkOutRoom() {
        //不需要做操作
    }
}
