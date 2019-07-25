package ru.ivanov.singtel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTest {

    @Test
    public void test() {
        AnimalFactory factory = new AnimalFactory();

        Animal[] animals = new Animal[]{
                factory.createBird(AnimalType.DUCK, null),
                factory.createBird(AnimalType.CHICKEN, null),
                factory.createBird(AnimalType.ROOSTER, null),
                factory.createBird(AnimalType.PARROT, () -> "Cock-a-doodle-doo"),
                factory.createFish(AnimalType.SHARK),
                factory.createFish(AnimalType.CLOWNFISH),
                factory.createMammal(AnimalType.DOLPHIN),
                factory.createMammal(AnimalType.DOG),
                factory.createMammal(AnimalType.CAT),
                factory.createInsect(AnimalType.BUTTERFLY)
        };

        assertEquals(3L, factory.getCanFlyCount());
        assertEquals(6L, factory.getCanWalkCount());
        assertEquals(4L, factory.getCanSingCount());
        assertEquals(5L, factory.getCanSwimCount());
    }
}
