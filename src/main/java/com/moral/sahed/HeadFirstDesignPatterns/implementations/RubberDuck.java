package com.moral.sahed.HeadFirstDesignPatterns.implementations;

import com.moral.sahed.HeadFirstDesignPatterns.Duck;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.FlyNoWay;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.Squeak;

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
