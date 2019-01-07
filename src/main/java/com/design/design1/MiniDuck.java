package com.design.design1;

import com.design.design1.god.DuckGod;
import com.design.design1.god.FlyBehavior;
import com.design.design1.god.QuackBehavior;

/**
 * @author huwenjian
 */
public class MiniDuck extends DuckGod implements FlyBehavior, QuackBehavior {


    @Override
    public void fly() {
        System.out.println("小鸭子不会飞！");
    }

    @Override
    public void quack() {
        System.out.println("小鸭子会叫！");
    }
}
