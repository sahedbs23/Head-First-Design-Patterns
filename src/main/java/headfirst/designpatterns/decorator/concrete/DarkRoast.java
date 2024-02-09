package headfirst.designpatterns.decorator.concrete;

import headfirst.designpatterns.decorator.contract.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
