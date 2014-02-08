/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleoffortune;


/**
 *
 * @author jacksonrkj
 */
public class MainMenuControl  {
    
    //default constructor
    public MainMenuControl() {
        
    } 
    
    public void display1PlayerGame() {
        displayBorder();            
        System.out.println( 
                "\tThis menu item selects a 1 player game");
        displayBorder();
    }
    
    public void display2PlayerGame() {
        displayBorder();            
        System.out.println( 
                "\tThis menu item selects a 2 player game");
        displayBorder();
    }    

    public void display3PlayerGame() {
        displayBorder();            
        System.out.println( 
                "\tThis menu item selects a 3 player game");
        displayBorder();
    }

    public void displayGameMenu() {
        // instance of the Game menu class
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.getInput();
    }
        
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }    
    
    private void displayBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
