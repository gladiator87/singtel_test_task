package ru.ivanov.singtel.mammals;

import ru.ivanov.singtel.action.MeowAction;
import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.action.WoofAction;

public class Cat extends Mammal {
    private SayAction sayAction;

    public Cat() {
        sayAction = new MeowAction();
    }

    public SayAction getSayAction() {
        return sayAction;
    }
}
