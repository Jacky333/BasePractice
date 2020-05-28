package com.pm.behavior.state;

/**
 * @author pengcheng
 * @version V1.0
 * @description 空闲状态只能预订和入住
 * @date 2019/03/26 16:16
 */
public class FreeTimeState implements State{
    Room hotelManagement;

    public FreeTimeState(Room hotelManagement){
        this.hotelManagement=hotelManagement;
    }


    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        //状态变成已经预订
        hotelManagement.setState(hotelManagement.getBookedState());

    }

    public void unsubscribeRoom() {
        //不需要做操作
    }

    public void checkInRoom() {
        System.out.println("您已经成功入住了...");
        //状态变成已经入住
        hotelManagement.setState(hotelManagement.getCheckInState());

    }

    public void checkOutRoom() {
        //不需要做操作
    }
}
