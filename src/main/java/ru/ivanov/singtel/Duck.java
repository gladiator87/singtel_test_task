package ru.ivanov.singtel;

import ru.ivanov.singtel.action.*;

public class Duck extends Bird {

    public Duck() {
        flyAction =  new CanFlyAction();
        swimAction =  new CanSwimAction();
        sayAction = new QuackAction();
    }

    public Duck(FlyAction flyAction, SwimAction swimAction, SayAction sayAction) {
        this.flyAction = flyAction;
        this.swimAction = swimAction;
        this.sayAction = sayAction;
    }
}