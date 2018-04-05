/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleutelbaricade;

import java.awt.GridLayout;
import java.io.File;
import java.net.URL;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cas
 */
public class LevelTest {

    private Level l;

    public LevelTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLevel method, of class Level. We testen een veld met allemaal barricades.
     */
    @Test
    public void testSetLevelAsPath() {
        System.out.println("getLevel");
        int x = 0;
        int y = 0;
        try {
            URL url = Level.class.getResource("test.txt");
            File f = new File(url.getPath());
            l = new Level(f);
        } catch (Exception e) {
            System.out.println("File niet gevonden!");
        }
        l.setLevelAsPath(1, 1);
        String expResult = "p";
        String result = l.getLevel(1, 1);
        assertEquals(expResult, result);

    }

}
