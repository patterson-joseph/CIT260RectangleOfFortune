/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.menu.views;

import BYUI.CIT260.RectangleOfFortune.views.GameMenuView;
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
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
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
     * Test of executeCommands method, of class GameMenuView.
     */
    @Test
    public void testExecuteCommands() {
        System.out.println("executeCommands");
        GameMenuView instance = null;
        String expResult = "";
        String result = instance.executeCommands();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
