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
public class tiposervicioTest {
    
    public tiposervicioTest() {
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
     * Test of getId method, of class tiposervicio.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        tiposervicio instance = new tiposervicio();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class tiposervicio.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        tiposervicio instance = new tiposervicio();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class tiposervicio.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        tiposervicio instance = new tiposervicio();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class tiposervicio.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        tiposervicio instance = new tiposervicio();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class tiposervicio.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        tiposervicio instance = new tiposervicio();
        float expResult = 0.0F;
        float result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class tiposervicio.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        float precio = 0.0F;
        tiposervicio instance = new tiposervicio();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIVA method, of class tiposervicio.
     */
    @Test
    public void testGetIVA() {
        System.out.println("getIVA");
        tiposervicio instance = new tiposervicio();
        String expResult = "";
        String result = instance.getIVA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIVA method, of class tiposervicio.
     */
    @Test
    public void testSetIVA() {
        System.out.println("setIVA");
        String IVA = "";
        tiposervicio instance = new tiposervicio();
        instance.setIVA(IVA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNArea method, of class tiposervicio.
     */
    @Test
    public void testGetNArea() {
        System.out.println("getNArea");
        tiposervicio instance = new tiposervicio();
        String expResult = "";
        String result = instance.getNArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNArea method, of class tiposervicio.
     */
    @Test
    public void testSetNArea() {
        System.out.println("setNArea");
        String NArea = "";
        tiposervicio instance = new tiposervicio();
        instance.setNArea(NArea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdesp method, of class tiposervicio.
     */
    @Test
    public void testGetIdesp() {
        System.out.println("getIdesp");
        tiposervicio instance = new tiposervicio();
        int expResult = 0;
        int result = instance.getIdesp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdesp method, of class tiposervicio.
     */
    @Test
    public void testSetIdesp() {
        System.out.println("setIdesp");
        int idesp = 0;
        tiposervicio instance = new tiposervicio();
        instance.setIdesp(idesp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
