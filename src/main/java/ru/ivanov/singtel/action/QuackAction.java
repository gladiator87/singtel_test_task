package ru.ivanov.singtel.action;

public class QuackAction implements SayAction {

    @Override
    public String getSayWord() {
        return "Quack, quack";
    }
}
