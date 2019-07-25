package ru.ivanov.singtel.behavior;

public class CanFlyBehavior implements FlyBehavior {
    @Override
    public void show() {
        System.out.println("I can fly");
    }
}
