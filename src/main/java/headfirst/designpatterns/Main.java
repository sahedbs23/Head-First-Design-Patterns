package headfirst.designpatterns;

import headfirst.designpatterns.implementations.MallarDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallerDuck = new MallarDuck();
        System.out.printf("%s %s",mallerDuck.performQuack(), mallerDuck.performFly());
    }
}
