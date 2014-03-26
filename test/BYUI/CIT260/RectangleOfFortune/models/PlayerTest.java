/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.models;

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
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String playerName = "";
        Player instance = null;
        instance.setPlayerName(playerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerRoundBank method, of class Player.
     */
    @Test
    public void testGetPlayerRoundBank() {
        System.out.println("getPlayerRoundBank");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayerRoundBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerGameBank method, of class Player.
     */
    @Test
    public void testGetPlayerGameBank() {
        System.out.println("getPlayerGameBank");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayerGameBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerGameBank method, of class Player.
     */
    @Test
    public void testSetPlayerGameBank() {
        System.out.println("setPlayerGameBank");
        int deposit = 0;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setPlayerGameBank(deposit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerRoundBank method, of class Player.
     */
    @Test
    public void testSetPlayerRoundBank() {
        System.out.println("setPlayerRoundBank");
        int letterValue = 0;
        int numberOfCorrectLetters = 0;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.setPlayerRoundBank(letterValue, numberOfCorrectLetters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
