/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import BYUI.CIT260.RectangleOfFortune.models.Game;
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
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName1() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game(3);
        String expResult = "Name1";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName2() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game(0);       
        String expResult = "";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }    

        /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName3() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game(2);     
        instance.changeCurrentPlayerTurn();
        String expResult = "Player2";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }    

        /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testGetCurrentPlayerName4() {
        System.out.println("getCurrentPlayerName");
        Game instance = new Game(3);       
        instance.changeCurrentPlayerTurn();
        instance.changeCurrentPlayerTurn();
        String expResult = "Player3";
        String result = instance.getCurrentPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }  
    
//        /**
//     * Test of getCurrentPlayerName method, of class Game.
//     */
//    @Test
//    public void testGetCurrentPlayerName5() {
//        System.out.println("getCurrentPlayerName");
//        Game instance = new Game(2);       
//        instance.player1.playerName="Name1";
//        instance.player2.playerName="Name2"; 
//        instance.currentPlayerNumberTurn=1;
//        String expResult = "Name1";
//        String result = instance.getCurrentPlayerName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }  
    
     /**
     * Test of getCurrentPlayerName method, of class Game.
     */
    @Test
    public void testChangePlayerTurn() {
        System.out.println("changePlayerTurn");
        Game instance = new Game(2);
        System.out.println("Current Player Name:" + instance.getCurrentPlayerName());
        String expResult = "Player2";
        instance.changeCurrentPlayerTurn();
        String result = instance.getCurrentPlayerName();
        System.out.println("Current Player Name after change player request:" + instance.getCurrentPlayerName());        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
//    /**
//     * Test of setCurrentPlayerName method, of class Game.
//     */
//    @Test
//    public void testSetCurrentPlayerName() {
//        System.out.println("setCurrentPlayerName");
//        String currentPlayerName = "";
//        Game instance = null;
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

 
//     /**
//     * Test of showCurrentPlayerStanding method, of class Game.
//     */
//    @Test
//    public void testShowCurrentPlayerStanding2() {
//        System.out.println("showCurrentPlayerStanding");
//        Game instance = new Game(0);
//        instance.showCurrentPlayerStanding();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//     /**
//     * Test of showCurrentPlayerStanding method, of class Game.
//     */
//    @Test
//    public void testShowCurrentPlayerStanding3() {
//        System.out.println("showCurrentPlayerStanding");
//        Game instance = new Game(2);
//        instance.player1.playerName="Player1";
//        instance.player1.playerBank_Round=0;      
//        instance.showCurrentPlayerStanding();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//    
//              /**
//     * Test of showCurrentPlayerStanding method, of class Game.
//     */
//    @Test
//    public void testShowCurrentPlayerStanding4() {
//        System.out.println("showCurrentPlayerStanding");
//        Game instance = new Game(2);
//        instance.player1.playerName="Player1";
//        instance.player1.playerBank_Round=-100;
//        instance.player2.playerName="Player2";
//        instance.player2.playerBank_Round=0;          
//        instance.showCurrentPlayerStanding();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//    
//      /**
//     * Test of showCurrentPlayerStanding method, of class Game.
//     */
//    @Test
//    public void testShowCurrentPlayerStanding5() {
//        System.out.println("showCurrentPlayerStanding");
//        Game instance = new Game(2);
//        instance.player1.playerName="Player1";
//        instance.player1.playerBank_Round=0;
//        instance.player2.playerName="Player2";
//        instance.player2.playerBank_Round=0;     
//        instance.showCurrentPlayerStanding();
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    

}
