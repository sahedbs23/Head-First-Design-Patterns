package headfirst.designpatterns.strategy.services;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.provider.FlyWithWings;
import headfirst.designpatterns.strategy.provider.Quack;

public class MallarDuck extends Duck {

    public MallarDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
