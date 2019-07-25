package ru.ivanov.singtel;

import org.junit.Test;
import ru.ivanov.singtel.fishes.Clownfish;
import ru.ivanov.singtel.fishes.Fish;
import ru.ivanov.singtel.fishes.Shark;
import ru.ivanov.singtel.parameters.Colour;
import ru.ivanov.singtel.parameters.Size;

import static org.junit.Assert.assertEquals;

public class FishTest extends BaseTest {

    @Test
    public void testShark() {
        Fish shark = new Shark();
        shark.swimBehavior.show();
        assertEquals("I can swim" + System.lineSeparator(), outStream.toString());
        assertEquals(Colour.GREY, shark.getColour());
        assertEquals(Size.BIG, shark.getSize());
    }

    @Test
    public void testClownfish() {
        Fish clownfish = new Clownfish();
        clownfish.swimBehavior.show();
        assertEquals("I can swim" + System.lineSeparator(), outStream.toString());
        assertEquals(Colour.COLOURFUL, clownfish.getColour());
        assertEquals(Size.SMALL, clownfish.getSize());
    }
}
