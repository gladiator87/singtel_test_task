package ru.ivanov.singtel;

import ru.ivanov.singtel.action.*;

/**
 * Base class for chicken. But can became Rooster if we change what he says.
 */
public class Chicken extends Bird {

    public Chicken() {
        flyAction =  new CanNotFlyAction();
        swimAction =  new CanNotSwimAction();
        sayAction = new QuackAction();
    }

    public Chicken(FlyAction flyAction, SwimAction swimAction, SayAction sayAction) {
        this.flyAction = flyAction;
        this.swimAction = swimAction;
        this.sayAction = sayAction;
    }
}
