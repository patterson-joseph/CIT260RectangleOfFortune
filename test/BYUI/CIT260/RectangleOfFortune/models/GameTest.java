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
     * Test of getPlayerCount method, of class Game.
     */
    @Test
    public void testGetPlayerCount() {
        System.out.println("getPlayerCount");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getPlayerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerCount method, of class Game.
     */
    @Test
    public void testSetPlayerCount() {
        System.out.println("setPlayerCount");
        int playerCount = 0;
        Game instance = new Game();
        instance.setPlayerCount(playerCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerNumberTurn method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerNumberTurn() {
        System.out.println("getCurrentPlayerNumberTurn");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getCurrentPlayerNumberTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayerNumberTurn method, of class Game.
     */
    @Test
    public void testSetCurrentPlayerNumberTurn() {
        System.out.println("setCurrentPlayerNumberTurn");
        int currentPlayerNumberTurn = 0;
        Game instance = new Game();
        instance.setCurrentPlayerNumberTurn(currentPlayerNumberTurn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game();
        String expResult = "";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class Game.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        Game instance = new Game();
        Player expResult = null;
        Player result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeCurrentPlayerTurn method, of class Game.
     */
    @Test
    public void testChangeCurrentPlayerTurn() {
        System.out.println("changeCurrentPlayerTurn");
        Game instance = new Game();
        instance.changeCurrentPlayerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfPlayers method, of class Game.
     */
    @Test
    public void testGetNumberOfPlayers() {
        System.out.println("getNumberOfPlayers");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getNumberOfPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of advanceToNextRound method, of class Game.
     */
    @Test
    public void testAdvanceToNextRound() {
        System.out.println("advanceToNextRound");
        Player roundWinner = null;
        Game instance = new Game();
        instance.advanceToNextRound(roundWinner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuzzle method, of class Game.
     */
    @Test
    public void testGetPuzzle() {
        System.out.println("getPuzzle");
        Game instance = new Game();
        Puzzle expResult = null;
        Puzzle result = instance.getPuzzle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerList method, of class Game.
     */
    @Test
    public void testGetPlayerList() {
        System.out.println("getPlayerList");
        Game instance = new Game();
        Player[] expResult = null;
        Player[] result = instance.getPlayerList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpinner method, of class Game.
     */
    @Test
    public void testGetSpinner() {
        System.out.println("getSpinner");
        Game instance = new Game();
        Spinner expResult = null;
        Spinner result = instance.getSpinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalNumberOfTurns method, of class Game.
     */
    @Test
    public void testGetTotalNumberOfTurns() {
        System.out.println("getTotalNumberOfTurns");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getTotalNumberOfTurns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePuzzleView method, of class Game.
     */
    @Test
    public void testChangePuzzleView() {
        System.out.println("changePuzzleView");
        Game instance = new Game();
        instance.changePuzzleView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPuzzle method, of class Game.
     */
    @Test
    public void testDisplayPuzzle() {
        System.out.println("displayPuzzle");
        Game instance = new Game();
        instance.displayPuzzle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerList method, of class Game.
     */
    @Test
    public void testSetPlayerList() {
        System.out.println("setPlayerList");
        Player[] playerList = null;
        Game instance = new Game();
        instance.setPlayerList(playerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
