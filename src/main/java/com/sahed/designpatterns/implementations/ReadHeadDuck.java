package com.sahed.designpatterns.implementations;

import com.sahed.designpatterns.Duck;
import com.sahed.designpatterns.concrete.FlyNoWay;
import com.sahed.designpatterns.concrete.Quack;

public class ReadHeadDuck extends Duck {
    public ReadHeadDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a Read Head Duck!");
    }
}
