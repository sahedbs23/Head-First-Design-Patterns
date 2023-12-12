package com.sahed.designpatterns;

import com.sahed.designpatterns.interfaces.FlyableInterface;
import com.sahed.designpatterns.interfaces.QuackableInterface;

public abstract class Duck {
    protected QuackableInterface quackBehaviour;

    protected FlyableInterface flyBehaviour;

    public String performQuack(){
        return quackBehaviour.quack();
    }
    public String performFly(){
        return flyBehaviour.fly();
    }

    public Duck setFlyBehaviour(FlyableInterface flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
        return this;
    }

    public abstract void display();
}
