/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
public class Class_Valida_CedulaTest {
    
    public Class_Valida_CedulaTest() {
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
     * Test of validadorDeCedula method, of class Class_Valida_Cedula.
     */
    @Test
    public void testValidadorDeCedula() {
        System.out.println("validadorDeCedula");
        String cedula = "";
        Class_Valida_Cedula instance = new Class_Valida_Cedula();
        boolean expResult = false;
        boolean result = instance.validadorDeCedula(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
