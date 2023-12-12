package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.FlyableInterface;

public class FlyWithWings implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying!";
    }
}
