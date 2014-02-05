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
     * Test of getPuzzleLength method, of class Board.
     */
    @Test
    public void testGetPuzzleLength() {
        System.out.println("getPuzzleLength");
        Game instance = new Game();
        instance.getPuzzleLength();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPuzzleText method, of class Board.
     */
    @Test
    public void testGetPuzzleText() {
        System.out.println("getPuzzleText");
        Game instance = new Game();
        instance.getPuzzleText();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfLettersGuessed method, of class Board.
     */
    @Test
    public void testGetNumberOfLettersGuessed() {
        System.out.println("getNumberOfLettersGuessed");
        String guessedLetter = "r";
        Game instance = new Game();
        instance.puzzleText="Lazy River";
        int expResult = 2;
        int result = instance.getNumberOfLettersGuessed(guessedLetter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
