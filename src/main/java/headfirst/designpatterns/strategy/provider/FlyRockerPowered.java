package headfirst.designpatterns.strategy.provider;

import headfirst.designpatterns.strategy.contract.FlyableInterface;

public class FlyRockerPowered implements FlyableInterface {
    @Override
    public String fly() {
        return "I am flying with a rocket!";
    }
}
