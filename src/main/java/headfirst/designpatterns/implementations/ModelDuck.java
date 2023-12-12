package headfirst.designpatterns.implementations;

import headfirst.designpatterns.Duck;
import headfirst.designpatterns.concrete.FlyWithWings;
import headfirst.designpatterns.concrete.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
