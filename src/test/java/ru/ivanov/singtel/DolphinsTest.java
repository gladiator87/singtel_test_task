package ru.ivanov.singtel;

import org.junit.Test;
import ru.ivanov.singtel.mammals.Dolphin;

import static org.junit.Assert.assertEquals;

public class DolphinsTest extends BaseTest {

    @Test
    public void test() {
        Dolphin dolphin = new Dolphin();
        dolphin.getSwimBehavior().show();
        assertEquals("I can swim" + System.lineSeparator(), outStream.toString());
    }
}
