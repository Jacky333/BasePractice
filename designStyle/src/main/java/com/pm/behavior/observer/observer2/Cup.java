package com.pm.behavior.observer.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 定义具体的被观察者：商品
 * @date 2019/04/03 16:59
 */
public class Cup implements Observable {
    /**
     * 被观察者维护的一个观察者对象列表
     */
    private List<Observer> list = new ArrayList<Observer>();

    private float price;

    public Cup(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        //修改价格时，通知所有观察者
        this.price = price;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        //注册观察者
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        //取消观察者
        list.remove(observer);
    }

    public void notifyObservers() {
        //实现通知所有的观察者对象
        for (Observer observer : list) {
            observer.update(price);
        }
    }
}
