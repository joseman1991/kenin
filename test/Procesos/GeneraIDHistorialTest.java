/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class GeneraIDHistorialTest {
    
    public GeneraIDHistorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarIDH method, of class GeneraIDHistorial.
     */
    @Test
    public void testGenerarIDH() {
        System.out.println("generarIDH");
        int dato = 0;
        GeneraIDHistorial instance = new GeneraIDHistorial();
        instance.generarIDH(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serieH method, of class GeneraIDHistorial.
     */
    @Test
    public void testSerieH() {
        System.out.println("serieH");
        GeneraIDHistorial instance = new GeneraIDHistorial();
        String expResult = "";
        String result = instance.serieH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
