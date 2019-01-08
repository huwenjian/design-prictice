package com.design.design2.observeble;

/**
 * 天气观察者 显示板
 *
 * @author huwenjian
 */
public interface WeatherObserver {
    public void update(String temp,String humidity,String pressure);
}
