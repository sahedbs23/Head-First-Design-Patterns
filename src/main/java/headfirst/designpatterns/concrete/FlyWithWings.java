package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.FlyableInterface;

public class FlyWithWings implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying!";
    }
}
