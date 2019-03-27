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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Kevin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Clases.Class_ServiciosTest.class, Clases.Class_UsuariosTest.class, Clases.Class_Valida_CedulaTest.class, Clases.LlenarCombosTest.class, Clases.Class_Tipos_ServiciosTest.class, Clases.Class_PacientesTest.class, Clases.facturaTest.class, Clases.Class_DoctoresTest.class, Clases.DataSetTest.class, Clases.MainTest.class, Clases.tiposervicioTest.class, Clases.Class_EspecialidadTest.class, Clases.ConectarTest.class})
public class ClasesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
