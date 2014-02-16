/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Dustin
 */
public class MainMenuView {
    
        
    private final static String[][] menuItems = {
        {"1", "1 Player Game"},
        {"2", "2 Player Game"},
        {"3", "3 Player Game"},
//        {"G", "Game Menu"},
        {"H", "Help Menu"},
        {"X", "Exit Rectangle of Fortune"},
    };
    
    // Create instance of the MainMenuControl class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
//     display the main menu and get input selection from user
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.mainMenuControl.display1PlayerGame();
                    break;
                case "2":
                    this.mainMenuControl.display2PlayerGame();
                    break;
                case "3":
                    this.mainMenuControl.display3PlayerGame();
                    break; 
//                case "G":
//                    this.mainMenuControl.displayGameMenu();
//                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "X": 
                    break;
                default: 
                    new RectangleOfFortuneError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));  
        
         return;
    }
    
//         displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
//}

    
}
