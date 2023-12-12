package headfirst.designpatterns.implementations;

import headfirst.designpatterns.Duck;
import headfirst.designpatterns.concrete.FlyWithWings;
import headfirst.designpatterns.concrete.Quack;

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
