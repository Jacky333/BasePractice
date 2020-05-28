package com.pm.behavior.observer.observer2;

/**
 * @author pengcheng
 * @version V1.0
 * @description 定义被观察者所具有的接口
 * @date 2019/04/03 16:57
 */
public interface Observable {
    /**
     * 注册一个观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 取消观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者更新信息
     */
    void notifyObservers();


}
