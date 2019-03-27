/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JComboBox;
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
public class Class_Tipos_ServiciosTest {
    
    public Class_Tipos_ServiciosTest() {
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
     * Test of IDServ method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testIDServ() {
        System.out.println("IDServ");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.IDServ();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String st = "";
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        tiposervicio expResult = null;
        tiposervicio result = instance.getTipo(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegistrarTPServicios method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testRegistrarTPServicios() {
        System.out.println("RegistrarTPServicios");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.RegistrarTPServicios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarTPServicios method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testMostrarTPServicios() {
        System.out.println("MostrarTPServicios");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.MostrarTPServicios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarTPServicios method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testActualizarTPServicios() {
        System.out.println("ActualizarTPServicios");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.ActualizarTPServicios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarTPServicios method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testEliminarTPServicios() {
        System.out.println("EliminarTPServicios");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.EliminarTPServicios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LLnarAreas method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testLLnarAreas() {
        System.out.println("LLnarAreas");
        JComboBox box = null;
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.LLnarAreas(box);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class Class_Tipos_Servicios.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        Class_Tipos_Servicios instance = new Class_Tipos_Servicios();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
