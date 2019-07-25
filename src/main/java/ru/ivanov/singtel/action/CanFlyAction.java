package ru.ivanov.singtel.action;

public class CanFlyAction implements FlyAction {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
