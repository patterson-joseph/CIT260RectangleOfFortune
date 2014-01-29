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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of displayName method, of class Player.
     */
    @Test
    public void testDisplayName() {
        System.out.println("displayName");
        Player instance = new Player();
        instance.displayName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBank method, of class Player.
     */
    @Test
    public void testDisplayBank() {
        System.out.println("displayBank");
        Player instance = new Player();
        instance.displayBank();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWins method, of class Player.
     */
    @Test
    public void testDisplayWins() {
        System.out.println("displayWins");
        Player instance = new Player();
        instance.displayWins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLosses method, of class Player.
     */
    @Test
    public void testDisplayLosses() {
        System.out.println("displayLosses");
        Player instance = new Player();
        instance.displayLosses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePlayerBank method, of class Player.
     */
    @Test
    public void testUpdatePlayerBank() {
        System.out.println("updatePlayerBank");
        int letterValue = 100;
        byte numberOfCorrectLetters = 2;
        Player instance = new Player();
        instance.playerBank=-1700;
        boolean expResult = false;
        boolean result = instance.updatePlayerBank(letterValue, numberOfCorrectLetters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
