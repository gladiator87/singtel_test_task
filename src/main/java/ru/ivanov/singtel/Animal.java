package ru.ivanov.singtel;

import ru.ivanov.singtel.action.SayAction;

public interface Animal {
    default void doAction(String action) {
        System.out.println("I am " + action);
    }

    default void walk() {
        doAction("walking");
    }

    void setSayAction(SayAction sayAction);
    SayAction getSayAction();
}
