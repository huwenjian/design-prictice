package com.design.design2;

import com.design.design2.observeble.CurrentConditionsDisplay;
import com.design.design2.observeble.FutureConditionsDisplay;
import com.design.design2.subject.WeatherData;

/**
 * @author huwenjian
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        FutureConditionsDisplay futureConditionsDisplay = new FutureConditionsDisplay(weatherData);


        //test
        weatherData.setMeasurements("30度", "60湿度", "1000Pa");
        weatherData.setMeasurements("300度", "600湿度", "10000Pa");
    }
}
