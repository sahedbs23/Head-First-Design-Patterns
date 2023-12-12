package com.sahed.designpatterns.implementations;

import com.sahed.designpatterns.Duck;
import com.sahed.designpatterns.concrete.FlyNoWay;
import com.sahed.designpatterns.concrete.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a rubber duck");
    }

}
