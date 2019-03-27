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
public class GenerarIDFacturaTest {
    
    public GenerarIDFacturaTest() {
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
     * Test of generarIDF method, of class GenerarIDFactura.
     */
    @Test
    public void testGenerarIDF() {
        System.out.println("generarIDF");
        int dato = 0;
        GenerarIDFactura instance = new GenerarIDFactura();
        instance.generarIDF(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serieF method, of class GenerarIDFactura.
     */
    @Test
    public void testSerieF() {
        System.out.println("serieF");
        GenerarIDFactura instance = new GenerarIDFactura();
        String expResult = "";
        String result = instance.serieF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
