package ru.ivanov.singtel;

import org.junit.Test;
import ru.ivanov.singtel.birds.Bird;
import ru.ivanov.singtel.birds.Chicken;
import ru.ivanov.singtel.birds.Duck;

import static org.junit.Assert.assertEquals;

public class ParrotTest extends BaseTest {

    @Test
    public void singTest() {
        Bird rooster = new Chicken();
        rooster.setSayAction(() -> "Cock-a-doodle-doo");

        AnimalFactory factory = new AnimalFactory();
        Bird parrot = factory.createBird(AnimalType.PARROT, rooster.getSayAction());
        parrot.doSay();
        assertEquals("Cock-a-doodle-doo" + System.lineSeparator(), outStream.toString());

        outStream.reset();

        Bird duck = new Duck();
        parrot = factory.createBird(AnimalType.PARROT, duck.getSayAction());
        parrot.doSay();
        assertEquals("Quack, quack" + System.lineSeparator(), outStream.toString());
    }

}
