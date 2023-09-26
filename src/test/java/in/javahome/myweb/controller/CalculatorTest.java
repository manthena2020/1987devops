package in.javahome.myweb.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void testAdd() {
        Assertions.assertEquals(cal.add(10, 20), 30);
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(cal.multiply(10, 20), 200);
    }
}
