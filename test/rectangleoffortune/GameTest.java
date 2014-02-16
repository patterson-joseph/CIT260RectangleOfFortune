/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Crossley Family
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of showCurrentPlayerTurn method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerTurn() {
        System.out.println("showCurrentPlayerTurn");
        Game instance = null;
        instance.showCurrentPlayerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName() {
        System.out.println("getCurrentPlayerName");
        Game instance = null;
        String expResult = "";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayerName method, of class Game.
     */
    @Test
    public void testSetCurrentPlayerName() {
        System.out.println("setCurrentPlayerName");
        String currentPlayerName = "";
        Game instance = null;
        instance.setCurrentPlayerName(currentPlayerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
