package ru.ivanov.singtel.action;

public class SilentAction implements SayAction {

    @Override
    public String getSayWord() {
        return "Silent";
    }
}
