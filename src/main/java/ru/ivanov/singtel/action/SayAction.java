package ru.ivanov.singtel.action;

public interface SayAction extends Action {
    String getSayWord();

    @Override
    default void doAction() {
        System.out.println(getSayWord());
    }
}
