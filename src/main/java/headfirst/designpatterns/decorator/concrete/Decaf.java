package headfirst.designpatterns.decorator.concrete;

import headfirst.designpatterns.decorator.contract.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
