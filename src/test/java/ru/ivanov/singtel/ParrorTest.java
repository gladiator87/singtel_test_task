package ru.ivanov.singtel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParrorTest extends BaseTest {

    @Test
    public void singTest() {
        Bird rooster = new Chicken();
        rooster.setSayAction(() -> "Cock-a-doodle-doo");

        Bird parrot = ParrotFactory.createParrot(rooster.getSayAction());
        parrot.doSay();
        assertEquals("Cock-a-doodle-doo" + System.lineSeparator(), outStream.toString());

        outStream.reset();

        Bird duck = new Duck();
        parrot = ParrotFactory.createParrot(duck.getSayAction());
        parrot.doSay();
        assertEquals("Quack, quack" + System.lineSeparator(), outStream.toString());
    }

}
