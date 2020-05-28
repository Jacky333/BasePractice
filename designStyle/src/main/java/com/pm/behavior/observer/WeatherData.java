package com.pm.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 主题实现类
 * @date 2019/04/03 16:27
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }

    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }

    }

    /**
     * 气象站得到更新的观测数据时，通知观察者
     */
    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
