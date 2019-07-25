package ru.ivanov.singtel.action;

public class MeowAction implements SayAction {

    @Override
    public String getSayWord() {
        return "Meow";
    }
}
