/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import BYUI.CIT260.RectangleOfFortune.menu.views.GameMenuView;
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
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
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

//    /**
//     * Test of getInput method, of class GameMenuView.
//     */
//    @Test
//    public void testGetInput() {
//        System.out.println("getInput");
//        Game game = new Game(1);
//        GameMenuView instance = new GameMenuView(game);
//        instance.getInput();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of display method, of class GameMenuView.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Game game = new Game(1);
        GameMenuView instance = new GameMenuView(game);
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
