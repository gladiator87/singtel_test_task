package ru.ivanov.singtel.birds;

import ru.ivanov.singtel.action.*;
import ru.ivanov.singtel.behavior.CanFlyBehavior;
import ru.ivanov.singtel.behavior.CanSwimBehavior;

public class Duck extends Bird {

    public Duck() {
        flyBehavior =  new CanFlyBehavior();
        swimBehavior =  new CanSwimBehavior();
        sayAction = new QuackAction();
    }
}
