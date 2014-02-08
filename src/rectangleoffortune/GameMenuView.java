/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleoffortune;

import java.util.Scanner;



/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuView  {
        
    private final static String[][] menuItems = {
        {"S", "Spin"},
        {"B", "Buy a Vowel"},
        {"P", "Solve the puzzle"},
        {"Q", "Quit Game"}
    };
    
    // Create instance of the HelpMenuControl (action) class
    private final GameMenuControl gameMenuControl = new GameMenuControl();
    
    // default constructor
    public GameMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "S":
                    this.gameMenuControl.spin();
                    break;
                case "B":
                    this.gameMenuControl.buyAVowel();
                    break;
                case "P":
                    this.gameMenuControl.solveThePuzzle();
                    break;                  
                case "Q": 
                    break;
                default: 
                    new RectangleOfFortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q")); 
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : GameMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
