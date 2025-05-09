package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Calculator классын тест.
 */
public class CalculatorTest {
    
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.add(2.0, 3.0), "2.0 + 3.0 нь 5.0-тай тэнцүү байх ёстой");
    }
    
    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(-1.0, calc.subtract(2.0, 3.0), "2.0 - 3.0 нь -1.0-тэй тэнцүү байх ёстой");
    }
}