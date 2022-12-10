/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Inicio;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ferno
 */
public class PanelPrincipalTest {
    
    public PanelPrincipalTest() {
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
     * Test of paint method, of class PanelPrincipal.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        PanelPrincipal instance = new PanelPrincipal();
//        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class PanelPrincipal.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent me = null;
        PanelPrincipal instance = new PanelPrincipal();
        instance.actionPerformed(me);
        // TODO review the generated test code and remove the default call to fail.
    }
}
