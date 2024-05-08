package org.antonio;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
public class TestFruta {

    Fruta fuego;
    Fruta papaya;

    @Before
    public void setUp(){

        fuego = new Fruta("Mera Mera", false);
        papaya = new Fruta("papaya", true);

    }

    @Test
    public void testSetters(){

        fuego.setNombre("papaya");
        papaya.setEsDeliciosa(false);

        assertEquals(papaya.getNombre(), fuego.getNombre());
        assertEquals("papaya",papaya.getNombre() );
        assertEquals(fuego.getEsDeliciosa(), papaya.getEsDeliciosa());
        assertFalse(papaya.getEsDeliciosa());


    }

    @Test
    public void testGetters(){

        String nom1 = fuego.getNombre();
        String nom2 = papaya.getNombre();

        assertTrue(fuego.getEsDeliciosa() != papaya.getEsDeliciosa());
        assertNotEquals(papaya.getNombre(), fuego.getNombre());
        assertFalse(nom1 == "");
        assertTrue(nom2 == "papaya");

    }


}
