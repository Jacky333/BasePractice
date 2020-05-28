package com.pm.behavior.memento;

/**
 * @author pengcheng
 * @version V1.0
 * @description 客户端
 * @date 2019/03/27 10:04
 */
public class Client {
    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker = new Caretaker();
        caretaker.memento = role.saveMemento();

        //大战BOSS，快game Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------大战BOSS----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------恢复----------");
        role.display();

    }

}
