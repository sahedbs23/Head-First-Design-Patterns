package headfirst.designpatterns.implementations;

import headfirst.designpatterns.Duck;
import headfirst.designpatterns.concrete.FlyNoWay;
import headfirst.designpatterns.concrete.Squeak;

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
