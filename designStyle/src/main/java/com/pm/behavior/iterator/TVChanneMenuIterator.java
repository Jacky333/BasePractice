package com.pm.behavior.iterator;

import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 电视界面的迭代器
 * @date 2019/03/26 19:48
 */
public class TVChanneMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public TVChanneMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position > menuItems.size() - 1 || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position ++;
        return menuItem;
    }
}
