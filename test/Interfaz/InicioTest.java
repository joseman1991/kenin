/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

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
public class InicioTest {
    
    public InicioTest() {
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
     * Test of acceder method, of class Inicio.
     */
    @Test
    public void testAcceder() {
        System.out.println("acceder");
        String usuario = "";
        String encriptado = "";
        Inicio instance = new Inicio();
        instance.acceder(usuario, encriptado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PermisosUsuarios method, of class Inicio.
     */
    @Test
    public void testPermisosUsuarios() {
        System.out.println("PermisosUsuarios");
        Inicio instance = new Inicio();
        instance.PermisosUsuarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inicio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
