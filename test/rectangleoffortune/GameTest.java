/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import java.util.HashSet;
import java.util.Set;
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
//        instance.showCurrentPlayerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game(1);
        instance.player1.playerName="Player1";
        String expResult = "Player1";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayerName method, of class Game.
     */
    @Test
    public void testSetCurrentPlayerName() {
        System.out.println("setCurrentPlayerName");
        String currentPlayerName = "";
        Game instance = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCurrentPlayerStanding method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerStanding1() {
        System.out.println("showCurrentPlayerStanding");
        Game instance = new Game(3);
        instance.player1.playerName="Player1";
        instance.player1.playerBank=0;
        instance.player2.playerName="Player2";
        instance.player2.playerBank=300;
        instance.player3.playerName="Player3";
        instance.player3.playerBank=500;        
        instance.showCurrentPlayerStanding();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

     /**
     * Test of showCurrentPlayerStanding method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerStanding2() {
        System.out.println("showCurrentPlayerStanding");
        Game instance = new Game(0);
        instance.showCurrentPlayerStanding();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

     /**
     * Test of showCurrentPlayerStanding method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerStanding3() {
        System.out.println("showCurrentPlayerStanding");
        Game instance = new Game(2);
        instance.player1.playerName="Player1";
        instance.player1.playerBank=0;      
        instance.showCurrentPlayerStanding();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
              /**
     * Test of showCurrentPlayerStanding method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerStanding4() {
        System.out.println("showCurrentPlayerStanding");
        Game instance = new Game(2);
        instance.player1.playerName="Player1";
        instance.player1.playerBank=-100;
        instance.player2.playerName="Player2";
        instance.player2.playerBank=0;          
        instance.showCurrentPlayerStanding();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
      /**
     * Test of showCurrentPlayerStanding method, of class Game.
     */
    @Test
    public void testShowCurrentPlayerStanding5() {
        System.out.println("showCurrentPlayerStanding");
        Game instance = new Game(2);
        instance.player1.playerName="Player1";
        instance.player1.playerBank=0;
        instance.player2.playerName="Player2";
        instance.player2.playerBank=0;     
        instance.showCurrentPlayerStanding();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    

}
