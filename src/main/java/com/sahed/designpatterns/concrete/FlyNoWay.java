package com.sahed.designpatterns.concrete;

import com.sahed.designpatterns.interfaces.FlyableInterface;

public class FlyNoWay implements FlyableInterface {
    @Override
    public String fly() {
        return "I can't fly!";
    }
}
