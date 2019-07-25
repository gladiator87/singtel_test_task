package ru.ivanov.singtel.fishes;

import ru.ivanov.singtel.SwimAnimal;
import ru.ivanov.singtel.behavior.SwimBehavior;
import ru.ivanov.singtel.parameters.Colour;
import ru.ivanov.singtel.parameters.Size;

/**
 * Base abstract class for different kind of fish
 */
public abstract class Fish extends SwimAnimal {

    protected Colour colour;
    protected Size size;

    public Fish(Colour colour, Size size) {
        this.colour = colour;
        this.size = size;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public Colour getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }
}
