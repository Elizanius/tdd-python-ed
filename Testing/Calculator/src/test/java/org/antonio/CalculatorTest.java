package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(4, 4));
        assertEquals(-8, calc.add(-4, -4));
        assertNotEquals(8, calc.add(4, 5));
        assertNotEquals(8, calc.add(-4, 5));
    }

    @Test
    public void testSubstract(){
        Calculator calc = new Calculator();
        assertEquals(0, calc.subtract(1, 1));
        assertNotEquals(0, calc.subtract(1, 2));
        assertEquals(-1, calc.subtract(-1, 0));
    }

    @Test
    public void testMultily(){
        Calculator calc = new Calculator();
        assertEquals(1, calc.multiply(1, 1));
        assertNotEquals(0, calc.multiply(1, 2));
        assertEquals(-1, calc.multiply(-1, 1));
        assertNotEquals(-1, calc.multiply(-1, 0));
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(1, calc.divide(1, 1), 0.01);
        assertNotEquals(0, calc.divide(24,2), 0.01);
        assertEquals(3, calc.divide(-9, -3), 0.01);
        assertNotEquals(0, calc.divide(-10,2), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        Calculator calc = new Calculator();
        calc.divide(1, 0);
    }

    @Test
    public void testDivideByZero2(){
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () ->{
            calc.divide(5, 0);
        } );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero3(){
        Calculator calc = new Calculator();
        calc.divide(-1, 0);
    }
    
}
