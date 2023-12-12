package com.sahed.designpatterns.implementations;

import com.sahed.designpatterns.Duck;
import com.sahed.designpatterns.concrete.FlyWithWings;
import com.sahed.designpatterns.concrete.Quack;

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
