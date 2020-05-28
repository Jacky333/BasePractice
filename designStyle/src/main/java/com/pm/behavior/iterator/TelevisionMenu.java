package com.pm.behavior.iterator;

/**
 * @author pengcheng
 * @version V1.0
 * @description 菜单接口
 * @date 2019/03/26 19:50
 */
public interface TelevisionMenu {
    public void addItem(int channe, String name, String description);

    public Iterator createItrerator();
}
