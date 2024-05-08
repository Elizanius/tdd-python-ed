package org.antonio;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorIntegrationTest {

    @Test
    public void testAddAndSubstract(){
        Calculator calc = new Calculator();
        assertEquals(calc.add(3, 3), calc.subtract(9, 3));
        assertEquals(calc.add(0, -4), calc.subtract(0, 4));
        assertNotEquals(calc.add(3, 3), calc.subtract(0, 3));
        assertNotEquals(calc.add(-3, -3), calc.subtract(-0, -3));
    }

    @Test
    public void testAddWithZero(){
        Calculator calc = new Calculator();
        assertEquals(0, calc.add(-0, 0));
        assertEquals(-2, calc.add(-2, 0));
        assertNotEquals(0 , calc.add(3, 0));
    }
    
    @Test
    public void testMultilyAndDivide(){
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(1, 1), calc.divide(1, 1), 0.001);
        assertEquals(calc.multiply(-3, 1), calc.divide(-3, 1), 0.001);
    }

    @Test
    public void testMultiplyWithZero(){
        Calculator calc = new Calculator();
        assertEquals(0, calc.multiply(3, 0));
        assertEquals(0,calc.multiply(-3, 0));
        assertNotEquals(1,calc.multiply(0, 0));
    }

    @Test
    public void testDivideWithZero(){
        Calculator calc = new Calculator();
        assertNotEquals(1, calc.divide(0, 1));
        assertEquals(1, calc.subtract(0, -1));
    }
}
