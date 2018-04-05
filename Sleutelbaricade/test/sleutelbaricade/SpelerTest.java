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
public class SpelerTest {
    
    public SpelerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


   

    /**
     * Test of getX method, of class Speler.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Speler instance = new Speler();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getY method, of class Speler.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Speler instance = new Speler();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
       
    }

  
 
}
