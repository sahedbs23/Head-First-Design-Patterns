package headfirst.designpatterns.decorator;

import headfirst.designpatterns.decorator.concrete.*;
import headfirst.designpatterns.decorator.contract.Beverage;

public class StartBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.printf("%s %.2f %n",espresso.getDescription(),espresso.cost());

        Beverage darkRoast = new DarkRoast();
        Beverage mocha1 = new Mocha(darkRoast);
        Beverage mocha2 = new Mocha(mocha1);
        Beverage whip = new Whip(mocha2);
        System.out.printf("%s %.2f %n",whip.getDescription(),whip.cost());


        Beverage houseBlend = new HouseBlend();
        Beverage soy = new Soy(houseBlend);
        Beverage mocha3 = new Mocha(soy);
        Beverage whip2 = new Whip(mocha3);
        System.out.printf("%s %.2f %n",whip2.getDescription(),whip2.cost());
    }
}
