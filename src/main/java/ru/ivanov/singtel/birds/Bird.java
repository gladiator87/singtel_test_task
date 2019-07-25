package ru.ivanov.singtel.birds;

import ru.ivanov.singtel.Animal;
import ru.ivanov.singtel.action.*;
import ru.ivanov.singtel.behavior.FlyBehavior;
import ru.ivanov.singtel.behavior.SwimBehavior;

/**
 * Abstract class Bird to hold base information about any kind of birds
 */
public abstract class Bird implements Animal {

    protected WalkAction walkAction;
    protected SingAction singAction;
    protected FlyAction flyAction;
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    protected SayAction sayAction;

    public Bird() {
        this.walkAction = new WalkAction();
        this.singAction = new SingAction();
        this.flyAction = new FlyAction();
    }

    public Bird(FlyBehavior flyBehavior, SwimBehavior swimBehavior, SayAction sayAction) {
        this.walkAction = new WalkAction();
        this.singAction = new SingAction();
        this.flyAction = new FlyAction();
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
        this.sayAction = sayAction;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void setSayAction(SayAction sayAction) {
        this.sayAction = sayAction;
    }

    public SayAction getSayAction() {
        return sayAction;
    }

    public void doFly() {
        flyBehavior.show();
    }

    public void doSay() {
        sayAction.doAction();
    }

    public void doSwim() {
        swimBehavior.show();
    }

    public void walk() {
        walkAction.doAction();
    }

    public void fly() {
        flyAction.doAction();
    }

    public void sing() {
        singAction.doAction();
    }
}
