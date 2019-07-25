package ru.ivanov.singtel.mammals;

import ru.ivanov.singtel.behavior.CanSwimBehavior;
import ru.ivanov.singtel.behavior.SwimBehavior;

public abstract class SwimMammalAnimal extends Mammal {
    protected SwimBehavior swimBehavior;

    public SwimMammalAnimal() {
        this.swimBehavior = new CanSwimBehavior();
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }
}
