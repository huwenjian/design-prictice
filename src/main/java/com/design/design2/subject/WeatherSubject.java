package com.design.design2.subject;

import com.design.design2.observeble.WeatherObserver;

/**
 * @author huwenjian
 */
public interface WeatherSubject {


    void registerObserver(WeatherObserver weatherObserver);

    void removeObserver(WeatherObserver weatherObserver);

    void notifyObservers();


}
