package ru.ivanov.singtel;

import ru.ivanov.singtel.action.FlyAction;
import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.action.SwimAction;

/**
 * Abstract class Bird to hold base information about any kind of birds
 */
public abstract class Bird implements Animal {
    protected FlyAction flyAction;
    protected SwimAction swimAction;
    protected SayAction sayAction;

    public Bird() {
    }

    public Bird(FlyAction flyAction, SwimAction swimAction, SayAction sayAction) {
        this.flyAction = flyAction;
        this.swimAction = swimAction;
        this.sayAction = sayAction;
    }

    public void setFlyAction(FlyAction flyAction) {
        this.flyAction = flyAction;
    }

    public void setSwimAction(SwimAction swimAction) {
        this.swimAction = swimAction;
    }

    @Override
    public void setSayAction(SayAction sayAction) {
        this.sayAction = sayAction;
    }

    @Override
    public SayAction getSayAction() {
        return sayAction;
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
