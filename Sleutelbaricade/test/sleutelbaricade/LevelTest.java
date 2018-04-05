/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbaricade;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cas
 */
public class LevelTest {
    
    public LevelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLevel method, of class Level.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        int x = 0;
        int y = 0;
        Level instance = new Level();
        String expResult = "";
        String result = instance.getLevel(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLevelAsPath method, of class Level.
     */
    @Test
    public void testSetLevelAsPath() {
        System.out.println("setLevelAsPath");
        int x = 0;
        int y = 0;
        Level instance = new Level();
        instance.setLevelAsPath(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBarricadeAsPath method, of class Level.
     */
    @Test
    public void testSetBarricadeAsPath() {
        System.out.println("setBarricadeAsPath");
        int x = 0;
        int y = 0;
        Level instance = new Level();
        instance.setBarricadeAsPath(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openLevel method, of class Level.
     */
    @Test
    public void testOpenLevel() {
        System.out.println("openLevel");
        Level instance = new Level();
        instance.openLevel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLevel method, of class Level.
     */
    @Test
    public void testReadLevel() {
        System.out.println("readLevel");
        Level instance = new Level();
        instance.readLevel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
