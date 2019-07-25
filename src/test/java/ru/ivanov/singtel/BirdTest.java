package ru.ivanov.singtel;

import org.junit.Test;
import ru.ivanov.singtel.birds.Bird;
import ru.ivanov.singtel.birds.Duck;

import static org.junit.Assert.assertEquals;

public class BirdTest extends BaseTest {

    @Test
    public void singTest() {
        Bird bird = new Duck();
        bird.sing();
        assertEquals("I am singing" + System.lineSeparator(), outStream.toString());
    }
}
