package com.sahed.designpatterns.implementations;

import com.sahed.designpatterns.Duck;
import com.sahed.designpatterns.concrete.FlyNoWay;
import com.sahed.designpatterns.concrete.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a decoy duck");
    }
}
