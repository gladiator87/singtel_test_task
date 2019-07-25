package ru.ivanov.singtel;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Base test class to catch System.out.println output and check content inside.
 */
public class BaseTest {

    protected final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    protected final ByteArrayOutputStream errStream = new ByteArrayOutputStream();

    protected final PrintStream originalOut = System.out;
    protected final PrintStream originalErr = System.err;

    @Before
    public void init() {
        System.setOut(new PrintStream(outStream));
        System.setErr(new PrintStream(errStream));
    }

    @After
    public void shutdown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
