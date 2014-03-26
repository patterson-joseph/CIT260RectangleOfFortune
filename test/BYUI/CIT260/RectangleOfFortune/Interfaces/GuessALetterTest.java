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
public class GuessALetterTest {
    
    public GuessALetterTest() {
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
     * Test of getInput method, of class GuessALetter.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        GuessALetter instance = new GuessALetterImpl();
        char expResult = ' ';
        char result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class GuessALetter.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        char[] validOptions = null;
        GuessALetter instance = new GuessALetterImpl();
        instance.display(validOptions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GuessALetterImpl implements GuessALetter {

        public char getInput() {
            return ' ';
        }

        public void display(char[] validOptions) {
        }
    }
    
}
