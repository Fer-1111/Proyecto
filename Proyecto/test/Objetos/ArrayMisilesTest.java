//Test para ver si 

package Objetos;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMisilesTest {
    
    public ArrayMisilesTest() {
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
     * Test of addMisil method, of class ArrayMisiles.
     */
    @Test
    public void testAddMisil() {
        System.out.println("addMisil");
        Misil m = null;
        ArrayMisiles instance = new ArrayMisiles();
        instance.addMisil(m);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacio method, of class ArrayMisiles.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        ArrayMisiles instance = new ArrayMisiles();
        boolean expResult = false;
        boolean result = instance.estaVacio();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMisil method, of class ArrayMisiles.
     */
    @Test
    public void testGetMisil() {
        System.out.println("getMisil");
        ArrayMisiles instance = new ArrayMisiles();
        Misil expResult = null;
//        Misil result = instance.getMisil();
  //      assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
}
