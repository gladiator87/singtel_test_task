package ru.ivanov.singtel.insect;

import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.action.SilentAction;
import ru.ivanov.singtel.behavior.CanFlyBehavior;
import ru.ivanov.singtel.behavior.FlyBehavior;

public class Butterfly extends Insect {
    private FlyBehavior flyBehavior;
    private SayAction sayAction;

    public Butterfly() {
        flyBehavior = new CanFlyBehavior();
        sayAction = new SilentAction();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public SayAction getSayAction() {
        return sayAction;
    }
}
