package ru.ivanov.singtel;

import ru.ivanov.singtel.action.SayAction;
import ru.ivanov.singtel.birds.Bird;
import ru.ivanov.singtel.birds.Chicken;
import ru.ivanov.singtel.birds.Duck;
import ru.ivanov.singtel.birds.Parrot;
import ru.ivanov.singtel.fishes.Clownfish;
import ru.ivanov.singtel.fishes.Fish;
import ru.ivanov.singtel.fishes.Shark;
import ru.ivanov.singtel.insect.Butterfly;
import ru.ivanov.singtel.insect.Caterpillar;
import ru.ivanov.singtel.insect.Insect;
import ru.ivanov.singtel.mammals.Cat;
import ru.ivanov.singtel.mammals.Dog;
import ru.ivanov.singtel.mammals.Dolphin;
import ru.ivanov.singtel.mammals.Mammal;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Class factory to create different animals and count them abilities
 */
public class AnimalFactory {

    private AtomicLong canFlyCount;
    private AtomicLong canWalkCount;
    private AtomicLong canSingCount;
    private AtomicLong canSwimCount;

    public AnimalFactory() {
        canFlyCount = new AtomicLong();
        canWalkCount = new AtomicLong();
        canSingCount = new AtomicLong();
        canSwimCount = new AtomicLong();
    }

    public Bird createBird(AnimalType type, SayAction neighborSayAction) {
        switch (type) {
            case DUCK:
                canFlyCount.incrementAndGet();
                canWalkCount.incrementAndGet();
                canSwimCount.incrementAndGet();
                canSingCount.incrementAndGet();
                return new Duck();
            case CHICKEN:
                canWalkCount.incrementAndGet();
                canSingCount.incrementAndGet();
                return new Chicken();
            case ROOSTER:
                canWalkCount.incrementAndGet();
                canSingCount.incrementAndGet();
                Bird rooster = new Chicken();
                rooster.setSayAction(() -> "Cock-a-doodle-doo");
                return rooster;
            case PARROT:
                canFlyCount.incrementAndGet();
                canWalkCount.incrementAndGet();
                canSingCount.incrementAndGet();
                return new Parrot(neighborSayAction);
            default: throw new IllegalArgumentException("Unknown bird type " + type);
        }
    }

    public Fish createFish(AnimalType type) {
        switch (type) {
            case SHARK:
                canSwimCount.incrementAndGet();
                return new Shark();
            case CLOWNFISH:
                canSwimCount.incrementAndGet();
                return new Clownfish();
            default: throw new IllegalArgumentException("Unknown fish type " + type);
        }
    }

    public Insect createInsect(AnimalType type) {
        switch (type) {
            case BUTTERFLY:
                canFlyCount.incrementAndGet();
                return new Butterfly();
            case CATERPILLAR:
                canWalkCount.incrementAndGet();
                return new Caterpillar();
            default: throw new IllegalArgumentException("Unknown insect type " + type);
        }
    }

    public Mammal createMammal(AnimalType type) {
        switch (type) {
            case DOLPHIN:
                canSwimCount.incrementAndGet();
                return new Dolphin();
            case DOG:
                canWalkCount.incrementAndGet();
                canSwimCount.incrementAndGet();
                return new Dog();
            case CAT:
                canWalkCount.incrementAndGet();
                return new Cat();
            default: throw new IllegalArgumentException("Unknown insect type " + type);
        }
    }

    public long getCanFlyCount() {
        return canFlyCount.get();
    }

    public long getCanWalkCount() {
        return canWalkCount.get();
    }

    public long getCanSingCount() {
        return canSingCount.get();
    }

    public long getCanSwimCount() {
        return canSwimCount.get();
    }

}
