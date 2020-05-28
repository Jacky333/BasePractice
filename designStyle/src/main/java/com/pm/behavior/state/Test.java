package com.pm.behavior.state;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/03/26 16:47
 */
public class Test {
    public static void main(String[] args) {
        //有2间房
        Room[] rooms = new Room[2];
        //初始化
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
        //第一间房
        rooms[0].bookRoom();
        rooms[0].checkInRoom();
        rooms[0].bookRoom();
        System.out.println(rooms[0]);
        System.out.println("---------------------------");

        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);
    }
}
