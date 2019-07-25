package ru.ivanov.singtel;

import org.junit.Test;
import ru.ivanov.singtel.insect.Butterfly;
import ru.ivanov.singtel.insect.ButterflyConverter;
import ru.ivanov.singtel.insect.Caterpillar;

import static org.junit.Assert.assertEquals;

public class ButterflyTest extends BaseTest {

    @Test
    public void test() {
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.getFlyBehavior().show();
        assertEquals("I can't fly" + System.lineSeparator(), outStream.toString());

        outStream.reset();
        ButterflyConverter converter = new ButterflyConverter();
        Butterfly butterfly = converter.convert(caterpillar);
        butterfly.getFlyBehavior().show();
        assertEquals("I can fly" + System.lineSeparator(), outStream.toString());
    }
}
