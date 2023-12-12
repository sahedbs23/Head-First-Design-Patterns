package com.moral.sahed.HeadFirstDesignPatterns.implementations;

import com.moral.sahed.HeadFirstDesignPatterns.Duck;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.FlyWithWings;
import com.moral.sahed.HeadFirstDesignPatterns.concrete.Quack;
import com.moral.sahed.HeadFirstDesignPatterns.interfaces.FlyableInterface;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
