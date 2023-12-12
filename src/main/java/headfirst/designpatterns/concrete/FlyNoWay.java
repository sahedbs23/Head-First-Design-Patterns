package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.FlyableInterface;

public class FlyNoWay implements FlyableInterface {
    @Override
    public String fly() {
        return "I can't fly!";
    }
}
