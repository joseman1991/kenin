/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTable;
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
public class Class_UsuariosTest {
    
    public Class_UsuariosTest() {
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
     * Test of IDUSER method, of class Class_Usuarios.
     */
    @Test
    public void testIDUSER() {
        System.out.println("IDUSER");
        Class_Usuarios instance = new Class_Usuarios();
        instance.IDUSER();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class Class_Usuarios.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Class_Usuarios instance = new Class_Usuarios();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrar_usuario method, of class Class_Usuarios.
     */
    @Test
    public void testRegistrar_usuario() {
        System.out.println("registrar_usuario");
        int estado = 0;
        int factu = 0;
        int svr = 0;
        int doc = 0;
        int areas = 0;
        int paci = 0;
        int seg = 0;
        Class_Usuarios instance = new Class_Usuarios();
        instance.registrar_usuario(estado, factu, svr, doc, areas, paci, seg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarUsuarios method, of class Class_Usuarios.
     */
    @Test
    public void testMostrarUsuarios() {
        System.out.println("MostrarUsuarios");
        JTable table = null;
        Class_Usuarios instance = new Class_Usuarios();
        instance.MostrarUsuarios(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
