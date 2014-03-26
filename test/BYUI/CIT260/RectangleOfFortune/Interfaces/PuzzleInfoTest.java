/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.Interfaces;

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
public class PuzzleInfoTest {
    
    public PuzzleInfoTest() {
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
     * Test of displayPuzzle method, of class PuzzleInfo.
     */
    @Test
    public void testDisplayPuzzle() {
        System.out.println("displayPuzzle");
        PuzzleInfo instance = new PuzzleInfoImpl();
        instance.displayPuzzle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PuzzleInfoImpl implements PuzzleInfo {

        public void displayPuzzle() {
        }
    }
    
}
