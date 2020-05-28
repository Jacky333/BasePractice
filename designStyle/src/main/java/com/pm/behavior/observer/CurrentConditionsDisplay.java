package com.pm.behavior.observer;

/**
 * @author pengcheng
 * @version V1.0
 * @description 布告板
 * @date 2019/04/03 16:44
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    public void dispaly() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }


    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        dispaly();
    }
}
