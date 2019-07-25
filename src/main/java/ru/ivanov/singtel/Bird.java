package ru.ivanov.singtel;

import ru.ivanov.singtel.action.FlyAction;
import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.action.SwimAction;

public class Bird implements Animal {
    protected FlyAction flyAction;
    protected SwimAction swimAction;
    protected SayAction sayAction;

    public Bird() {
    }

    public void setFlyAction(FlyAction flyAction) {
        this.flyAction = flyAction;
    }

    public void setSwimAction(SwimAction swimAction) {
        this.swimAction = swimAction;
    }

    public void setSayAction(SayAction sayAction) {
        this.sayAction = sayAction;
    }


    public void doFly() {
        flyAction.fly();
    }

    public void doSay() {
        sayAction.say();
    }

    public void doSwim() {
        swimAction.swim();
    }

    public void fly() {
        doAction("flying");
    }

    public void sing() {
        doAction("singing");
    }
}
