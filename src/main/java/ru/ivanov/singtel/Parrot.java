package ru.ivanov.singtel;

import ru.ivanov.singtel.action.*;

public class Parrot extends Bird {

    public Parrot(SayAction sayAction) {
        this.flyAction =  new CanFlyAction();
        this.swimAction =  new CanNotSwimAction();
        this.sayAction = sayAction;
    }
}
