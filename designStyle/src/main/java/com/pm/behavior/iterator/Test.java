package com.pm.behavior.iterator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/03/26 20:01
 */
public class Test {
    public static void main(String[] args) {
        TelevisionMenu tvMenu = new TVChanneMenu();
        TelevisionMenu filmMenu = new FilmMenu();

        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}
