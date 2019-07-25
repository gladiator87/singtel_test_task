package ru.ivanov.singtel.mammals;

import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.action.WoofAction;

public class Dog extends Mammal {
    private SayAction sayAction;

    public Dog() {
        sayAction = new WoofAction();
    }

    public SayAction getSayAction() {
        return sayAction;
    }
}
