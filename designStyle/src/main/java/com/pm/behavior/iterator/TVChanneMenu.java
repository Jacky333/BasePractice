package com.pm.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 电视聚合类
 * @date 2019/03/26 19:53
 */
public class TVChanneMenu implements TelevisionMenu {
    List<MenuItem> menuItems;

    /**
     * 构造函数完成初始化
     */
    public TVChanneMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }


    public void addItem(int channe, String name, String description) {
        MenuItem tvMenuItem = new MenuItem(channe, name, description);
        menuItems.add(tvMenuItem);
    }

    public Iterator createItrerator() {
        return new TVChanneMenuIterator(menuItems);
    }
}
