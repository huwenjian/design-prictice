package com.design.design1;

import com.design.design1.god.DuckGod;
import com.design.design1.god.FlyBehavior;
import com.design.design1.god.QuackBehavior;

public class BigDuck extends DuckGod implements FlyBehavior, QuackBehavior {

    @Override
    public void fly() {
        System.out.println("大鸭子可以飞");
    }

    @Override
    public void quack() {
        System.out.println("打鸭子也可以叫");
    }
}
