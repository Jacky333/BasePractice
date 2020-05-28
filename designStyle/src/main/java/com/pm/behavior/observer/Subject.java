package com.pm.behavior.observer;

/**
 * @author pengcheng
 * @version V1.0
 * @description 主题接口
 * @date 2019/04/03 16:23
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public void  notifyObserver();
}
