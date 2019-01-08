package com.design.design2.observeble;

import com.design.design2.subject.WeatherSubject;

/**
 * 当前显示面板 相当于一个观察者
 *
 * @author huwenjian
 */
public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {

    public String temperature;
    public String humidity;
    public String pressure;

    private WeatherSubject weatherSubject;

    public CurrentConditionsDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void update(String temp, String humidity, String pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {

        System.out.println("当前面板显示是 压力 : " + temperature + " 湿度：" + humidity + " 压力：" + pressure);

    }
}
