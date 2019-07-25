package ru.ivanov.singtel;

import ru.ivanov.singtel.action.SayAction;

/**
 * Class to create Parrot with correct say word from neighbor.
 */
public class ParrotFactory {

    public static Parrot createParrot(SayAction neighborSayAction) {
        return new Parrot(neighborSayAction);
    }

}
