package com.moral.sahed.HeadFirstDesignPatterns.implementations;

import com.moral.sahed.HeadFirstDesignPatterns.Duck;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.FlyNoWay;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.MuteQuack;

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
