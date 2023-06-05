package ru.gb.app;

import ru.gb.operation.Action;
import ru.gb.operation.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Decorator.doIt(Action.mult(2, 5)));
        System.out.println(Decorator.doIt(Action.sub(2, 5)));
        System.out.println(Decorator.doIt(Action.sum(2, 5)));
        System.out.println(Decorator.doIt(Action.div(8, 5)));
    }
}
