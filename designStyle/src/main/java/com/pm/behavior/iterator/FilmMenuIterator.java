package com.pm.behavior.iterator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 电影节目的迭代器
 * @date 2019/03/26 19:40
 */
public class FilmMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position > menuItems.length - 1 || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
