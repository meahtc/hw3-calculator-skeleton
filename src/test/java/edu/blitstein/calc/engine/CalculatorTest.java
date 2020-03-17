package edu.blitstein.calc.engine;

import edu.blitstein.calc.exception.UnknownOpException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testEvaluatePlus() throws UnknownOpException {
        Calculator calculator = new Calculator(4.0);
        double actualResult = calculator.evaluate('+', 6.0);
        assertEquals(10.0, actualResult, 0.0001);
    }
}