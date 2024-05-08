package org.antonio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestBarco {

    Barco Mugiwara1;
    Barco Mugiwara2;

    @Before
    public void setUp(){

        Mugiwara1 = new Barco("Going Merry", 9);
        Mugiwara2 = new Barco("Sunny", 10);

    }

    @Test
    public void testSetters(){

        Mugiwara1.setNombre("Sunny");
        Mugiwara2.setCapacidad(11);

        assertEquals(Mugiwara2.getNombre(), Mugiwara1.getNombre());
        assertEquals("Sunny",Mugiwara2.getNombre() );
        assertNotEquals(Mugiwara1.getCapacidad(), Mugiwara2.getCapacidad());


    }

    @Test
    public void testGetters(){

        String nom1 = Mugiwara1.getNombre();
        String nom2 = Mugiwara2.getNombre();

        assertEquals(Mugiwara2.getCapacidad(), Mugiwara1.getCapacidad());
        assertNotEquals(Mugiwara2.getNombre(), Mugiwara1.getNombre());
        assertFalse(nom1 == "");
        assertTrue(nom2 == "Sunny");

    }

    @Test
    public void testAgregarTripulantes(){

        assertTrue(Mugiwara1.agregarTripulante());
        assertFalse(Mugiwara2.agregarTripulante());

    }

}
