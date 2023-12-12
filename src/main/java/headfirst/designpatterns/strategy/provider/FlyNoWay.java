package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.FlyableInterface;

public class FlyNoWay implements FlyableInterface {
    @Override
    public String fly() {
        return "I can't fly!";
    }
}
