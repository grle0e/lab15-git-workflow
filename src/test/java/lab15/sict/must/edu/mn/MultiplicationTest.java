package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Multiplication.
 */
public class MultiplicationTest {
    
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 should equal 6");
    }
    
    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 should equal -6");
    }
    
    @Test
    void testMultiplyZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(0.0, 3.0), "0 * 3 should equal 0");
    }
}