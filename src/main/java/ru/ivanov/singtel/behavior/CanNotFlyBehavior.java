package ru.ivanov.singtel.behavior;

public class CanNotFlyBehavior implements FlyBehavior {
    @Override
    public void show() {
        System.out.println("I can't fly");
    }
}
