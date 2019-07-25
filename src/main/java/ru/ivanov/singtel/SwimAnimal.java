package ru.ivanov.singtel;

import ru.ivanov.singtel.behavior.CanSwimBehavior;
import ru.ivanov.singtel.behavior.SwimBehavior;

public abstract class SwimAnimal implements Animal {
    protected SwimBehavior swimBehavior;

    public SwimAnimal() {
        this.swimBehavior = new CanSwimBehavior();
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }
}
