/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.menu.controls;

import BYUI.CIT260.RectangleOfFortune.models.Game;
import BYUI.CIT260.RectangleOfFortune.models.Player;
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
public class GameMenuControlTest {
    
    public GameMenuControlTest() {
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
     * Test of spin method, of class GameMenuControl.
     */
    @Test
    public void testSpin() {
        System.out.println("spin");
        Game game = null;
        GameMenuControl.spin(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyAVowel method, of class GameMenuControl.
     */
    @Test
    public void testBuyAVowel() {
        System.out.println("buyAVowel");
        Game game = null;
        GameMenuControl.buyAVowel(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveThePuzzle method, of class GameMenuControl.
     */
    @Test
    public void testSolveThePuzzle() {
        System.out.println("solveThePuzzle");
        Game game = null;
        boolean expResult = false;
        boolean result = GameMenuControl.solveThePuzzle(game);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCurrentPlayerStanding method, of class GameMenuControl.
     */
    @Test
    public void testShowCurrentPlayerStanding() {
        System.out.println("showCurrentPlayerStanding");
        Player[] playerList = null;
        GameMenuControl.showCurrentPlayerStanding(playerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePuzzleView method, of class GameMenuControl.
     */
    @Test
    public void testChangePuzzleView() {
        System.out.println("changePuzzleView");
        Game game = null;
        GameMenuControl.changePuzzleView(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
