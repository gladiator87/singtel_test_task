package ru.ivanov.singtel.birds;

import ru.ivanov.singtel.action.*;
import ru.ivanov.singtel.behavior.CanFlyBehavior;
import ru.ivanov.singtel.behavior.CanNotSwimBehavior;

public class Parrot extends Bird {

    public Parrot(SayAction sayAction) {
        this.flyBehavior =  new CanFlyBehavior();
        this.swimBehavior =  new CanNotSwimBehavior();
        this.sayAction = sayAction;
    }
}
