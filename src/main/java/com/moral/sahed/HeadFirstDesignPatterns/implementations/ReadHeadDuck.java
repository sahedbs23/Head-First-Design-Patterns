package com.moral.sahed.HeadFirstDesignPatterns.implementations;

import com.moral.sahed.HeadFirstDesignPatterns.Duck;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.FlyNoWay;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.Quack;

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
