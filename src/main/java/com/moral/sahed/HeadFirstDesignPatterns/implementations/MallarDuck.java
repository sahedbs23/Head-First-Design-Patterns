package com.moral.sahed.HeadFirstDesignPatterns.implementations;

import com.moral.sahed.HeadFirstDesignPatterns.Duck;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.FlyWithWings;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.Quack;

public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
