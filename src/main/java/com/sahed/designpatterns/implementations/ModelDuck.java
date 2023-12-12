package com.sahed.designpatterns.implementations;

import com.sahed.designpatterns.Duck;
import com.sahed.designpatterns.concrete.FlyWithWings;
import com.sahed.designpatterns.concrete.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
