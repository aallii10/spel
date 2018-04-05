/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbaricade;

import java.awt.Image;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cas
 */
public class MuurTest {
    
    public MuurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMuur method, of class Muur.
     */
    @Test
    public void testGetMuur() {
        System.out.println("getMuur");
        Muur instance = new Muur();
        Image expResult = null;
        Image result = instance.getMuur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBewandelbaar method, of class Muur.
     */
    @Test
    public void testIsBewandelbaar() {
        System.out.println("isBewandelbaar");
        Muur instance = new Muur();
        boolean expResult = false;
        boolean result = instance.isBewandelbaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
