/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

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
public class V_EspecialidadTest {
    
    public V_EspecialidadTest() {
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
     * Test of getIdesp method, of class V_Especialidad.
     */
    @Test
    public void testGetIdesp() {
        System.out.println("getIdesp");
        V_Especialidad instance = new V_Especialidad();
        int expResult = 0;
        int result = instance.getIdesp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdesp method, of class V_Especialidad.
     */
    @Test
    public void testSetIdesp() {
        System.out.println("setIdesp");
        int idesp = 0;
        V_Especialidad instance = new V_Especialidad();
        instance.setIdesp(idesp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNesp method, of class V_Especialidad.
     */
    @Test
    public void testGetNesp() {
        System.out.println("getNesp");
        V_Especialidad instance = new V_Especialidad();
        String expResult = "";
        String result = instance.getNesp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNesp method, of class V_Especialidad.
     */
    @Test
    public void testSetNesp() {
        System.out.println("setNesp");
        String nesp = "";
        V_Especialidad instance = new V_Especialidad();
        instance.setNesp(nesp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class V_Especialidad.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        V_Especialidad instance = new V_Especialidad();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
