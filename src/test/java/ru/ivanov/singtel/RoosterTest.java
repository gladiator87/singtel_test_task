package ru.ivanov.singtel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoosterTest extends BaseTest {

    @Test
    public void sayTest() {
        Chicken rooster = new Chicken();
        rooster.setSayAction(() -> "Cock-a-doodle-doo");
        rooster.doSay();
        assertEquals("Cock-a-doodle-doo" + System.lineSeparator(), outStream.toString());

    }
}
