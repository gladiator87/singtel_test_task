package ru.ivanov.singtel;

public interface Animal {
    default void doAction(String action) {
        System.out.println("I am " + action);
    }

    default void walk() {
        doAction("walking");
    }
}
