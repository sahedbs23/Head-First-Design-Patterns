package headfirst.designpatterns.strategy.services;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.provider.FlyWithWings;
import headfirst.designpatterns.strategy.provider.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
