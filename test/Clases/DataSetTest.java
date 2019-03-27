/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
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
public class DataSetTest {
    
    public DataSetTest() {
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
     * Test of setCellEditable method, of class DataSet.
     */
    @Test
    public void testSetCellEditable() {
        System.out.println("setCellEditable");
        boolean cellEditable = false;
        DataSet instance = new DataSet();
        instance.setCellEditable(cellEditable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellEditable method, of class DataSet.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int row = 0;
        int column = 0;
        DataSet instance = new DataSet();
        boolean expResult = false;
        boolean result = instance.isCellEditable(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class DataSet.
     */
    @Test
    public void testLoad() throws Exception {
        System.out.println("load");
        ResultSet resultado = null;
        DataSet instance = new DataSet();
        instance.load(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
