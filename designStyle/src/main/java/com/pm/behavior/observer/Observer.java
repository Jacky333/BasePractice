package com.pm.behavior.observer;

/**
 * @author pengcheng
 * @version V1.0
 * @description 观察者接口
 * @date 2019/04/03 16:25
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
