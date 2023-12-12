package headfirst.designpatterns.strategy.services;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.provider.FlyNoWay;
import headfirst.designpatterns.strategy.provider.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + " : looks like a rubber duck");
    }

}
