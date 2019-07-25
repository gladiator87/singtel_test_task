package ru.ivanov.singtel.action;

public class CanNotSwimAction implements SwimAction {
    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
