package ru.ivanov.singtel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest extends BaseTest {

    @Test
    public void singTest() {
        Bird bird = new Duck();
        bird.doFly();
        bird.doSay();
        bird.doSwim();

        assertEquals("I can fly" + System.lineSeparator() +
                        "Quack, quack" + System.lineSeparator() +
                        "I can swim" + System.lineSeparator()
                , outStream.toString());

        outStream.reset();

        Bird strangeDuck = new Duck();
        strangeDuck.setFlyAction(() -> System.out.println("I can rocket fly"));

        strangeDuck.doFly();
        strangeDuck.doSay();
        strangeDuck.doSwim();
        assertEquals("I can rocket fly" + System.lineSeparator() +
                        "Quack, quack" + System.lineSeparator() +
                        "I can swim" + System.lineSeparator()
                , outStream.toString());

    }
}
