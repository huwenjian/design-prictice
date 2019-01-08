package com.design.design2.subject;

import com.design.design2.observeble.WeatherObserver;

import java.util.ArrayList;

/**
 * @author huwenjian
 */
public class WeatherData implements WeatherSubject {
    /**
     * 用来记录观察者
     */
    private ArrayList weatherObservers;

    public WeatherData() {
        weatherObservers = new ArrayList();
    }

    String temperature;
    String humidity;
    String pressure;


    /**
     * 实现观察者模式
     * 当气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged() {
        System.out.println("开始通知所有的显示面板 观察者");
        notifyObservers();
    }


    public WeatherData(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }


    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        int i = weatherObservers.indexOf(weatherObserver);
        if (i >= 0) {
            weatherObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object weatherObserver1 : weatherObservers) {
            WeatherObserver weatherObserver = (WeatherObserver) weatherObserver1;
            weatherObserver.update(temperature, humidity, pressure);
        }
    }

    /**
     * 只是为了测试 设置新的值
     */
    public void setMeasurements(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
