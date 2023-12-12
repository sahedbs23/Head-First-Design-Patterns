package headfirst.designpatterns;

import headfirst.designpatterns.strategy.contract.Duck;
import headfirst.designpatterns.strategy.services.MallarDuck;

public class Main {
    public static void main(String[] args) {
        mallerDuck();
    }

    public static void mallerDuck(){
        Duck mallerDuck = new MallarDuck();
        System.out.printf("%s %s",mallerDuck.performQuack(), mallerDuck.performFly());
    }
}
