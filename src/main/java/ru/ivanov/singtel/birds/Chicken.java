package ru.ivanov.singtel.birds;

import ru.ivanov.singtel.action.*;
import ru.ivanov.singtel.behavior.CanNotFlyBehavior;
import ru.ivanov.singtel.behavior.CanNotSwimBehavior;

/**
 * Base class for chicken. But can became Rooster if we change what he says.
 */
public class Chicken extends Bird {

    public Chicken() {
        flyBehavior =  new CanNotFlyBehavior();
        swimBehavior =  new CanNotSwimBehavior();
        sayAction = new QuackAction();
    }
}
