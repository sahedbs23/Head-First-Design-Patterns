package headfirst.designpatterns.concrete;

import headfirst.designpatterns.interfaces.FlyableInterface;

public class FlyRockerPowered implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying with a rocket!";
    }
}
