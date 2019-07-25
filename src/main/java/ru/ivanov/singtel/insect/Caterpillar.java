package ru.ivanov.singtel.insect;

import ru.ivanov.singtel.action.CrawlAction;
import ru.ivanov.singtel.behavior.CanNotFlyBehavior;
import ru.ivanov.singtel.behavior.FlyBehavior;

public class Caterpillar extends Insect {
    private FlyBehavior flyBehavior;
    private CrawlAction crawlAction;

    public Caterpillar() {
        flyBehavior = new CanNotFlyBehavior();
        crawlAction = new CrawlAction();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public CrawlAction getCrawlAction() {
        return crawlAction;
    }
}
