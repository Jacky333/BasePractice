package com.pm.behavior.iterator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 主菜单
 * @date 2019/03/26 19:55
 */
public class MainMenu {
    TelevisionMenu tvMenu;
    TelevisionMenu filmMenu;

    public MainMenu(TelevisionMenu tvMenu, TelevisionMenu filmMenu) {
        this.tvMenu = tvMenu;
        this.filmMenu = filmMenu;
    }

    public void printMenu() {
        Iterator tvItrerator = tvMenu.createItrerator();
        Iterator filmItrerator = filmMenu.createItrerator();
        System.out.println("电视节目有");
        printMenu(tvItrerator);
        System.out.println("----------------------------------------------------------------");
        System.out.println("电影节目有:");
        printMenu(filmItrerator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print("channe:" + menuItem.getChanne() + ",  ");
            System.out.print("name:" + menuItem.getName() + ",  ");
            System.out.println("description :" + menuItem.getDescription());
        }

    }

}
