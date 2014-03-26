/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.Enums;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joseph
 */
public class MainMenuItemsTest {
    
    public MainMenuItemsTest() {
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
     * Test of values method, of class MainMenuItems.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        MainMenuItems[] expResult = null;
        MainMenuItems[] result = MainMenuItems.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class MainMenuItems.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        MainMenuItems expResult = null;
        MainMenuItems result = MainMenuItems.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainText method, of class MainMenuItems.
     */
    @Test
    public void testGetMainText() {
        System.out.println("getMainText");
        MainMenuItems instance = null;
        String expResult = "";
        String result = instance.getMainText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
