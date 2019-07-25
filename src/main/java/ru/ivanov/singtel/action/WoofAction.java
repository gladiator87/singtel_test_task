package ru.ivanov.singtel.action;

public class WoofAction implements SayAction {

    @Override
    public String getSayWord() {
        return "Woof, woof";
    }
}
