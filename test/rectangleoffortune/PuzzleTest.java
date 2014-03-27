/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import BYUI.CIT260.RectangleOfFortune.models.Letter;
import BYUI.CIT260.RectangleOfFortune.models.Puzzle;
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
public class PuzzleTest {
    
    PuzzleTest() {
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
     * Test of countLetters method, of class Puzzle_Easy.
     */
    @Test
    public void testCountLetters() {
        System.out.println("countLetters");
        char letter = 'Z';
        Puzzle instance=new Puzzle();
        int expResult = 0;
        int result = instance.countLetters(letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectNewPuzzle method, of class Puzzle.
     */
    @Test
    public void testSelectNewPuzzle() {
        System.out.println("selectNewPuzzle");
        Puzzle instance = new Puzzle();
        instance.selectNewPuzzle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeWinningPuzzleVisible method, of class Puzzle.
     */
    @Test
    public void testMakeWinningPuzzleVisible() {
        System.out.println("makeWinningPuzzleVisible");
        Puzzle instance = new Puzzle();
        instance.makeWinningPuzzleVisible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuzzleText method, of class Puzzle.
     */
    @Test
    public void testGetPuzzleText() {
        System.out.println("getPuzzleText");
        Puzzle instance = new Puzzle();
        String expResult = "";
        String result = instance.getPuzzleText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populatePuzzleList method, of class Puzzle.
     */
    @Test
    public void testPopulatePuzzleList() {
        System.out.println("populatePuzzleList");
        Puzzle instance = new Puzzle();
        instance.populatePuzzleList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPuzzle method, of class Puzzle.
     */
    @Test
    public void testGetCurrentPuzzle() {
        System.out.println("getCurrentPuzzle");
        Puzzle instance = new Puzzle();
        Letter[] expResult = null;
        Letter[] result = instance.getCurrentPuzzle();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordCount method, of class Puzzle.
     */
    @Test
    public void testGetWordCount() {
        System.out.println("getWordCount");
        Puzzle instance = new Puzzle();
        int expResult = 0;
        int result = instance.getWordCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordEndPosition method, of class Puzzle.
     */
    @Test
    public void testGetWordEndPosition() {
        System.out.println("getWordEndPosition");
        int startWordPosition = 0;
        Puzzle instance = new Puzzle();
        int expResult = 0;
        int result = instance.getWordEndPosition(startWordPosition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
