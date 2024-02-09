package headfirst.designpatterns.decorator.concrete;

import headfirst.designpatterns.decorator.contract.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
