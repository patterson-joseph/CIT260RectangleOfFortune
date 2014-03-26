/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.menu.controls;

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
public class MainMenuControlTest {
    
    public MainMenuControlTest() {
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
     * Test of displayGame method, of class MainMenuControl.
     */
    @Test
    public void testDisplayGame() {
        System.out.println("displayGame");
        int numberOfPlayers = 0;
        MainMenuControl.displayGame(numberOfPlayers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayHelpMenu method, of class MainMenuControl.
     */
    @Test
    public void testDisplayHelpMenu() throws Exception {
        System.out.println("displayHelpMenu");
        MainMenuControl.displayHelpMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
