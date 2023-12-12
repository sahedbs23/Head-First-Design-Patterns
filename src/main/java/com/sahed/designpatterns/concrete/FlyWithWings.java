package com.sahed.designpatterns.concrete;

import com.sahed.designpatterns.interfaces.FlyableInterface;

public class FlyWithWings implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying!";
    }
}
