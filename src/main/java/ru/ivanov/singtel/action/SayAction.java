package ru.ivanov.singtel.action;

public interface SayAction {
    String getSayWord();

    default void say() {
        System.out.println(getSayWord());
    }
}
