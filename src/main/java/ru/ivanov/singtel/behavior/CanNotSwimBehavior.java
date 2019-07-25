package ru.ivanov.singtel.behavior;

public class CanNotSwimBehavior implements SwimBehavior {
    @Override
    public void show() {
        System.out.println("I can't swim");
    }
}
