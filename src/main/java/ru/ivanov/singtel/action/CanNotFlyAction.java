package ru.ivanov.singtel.action;

public class CanNotFlyAction implements FlyAction {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
