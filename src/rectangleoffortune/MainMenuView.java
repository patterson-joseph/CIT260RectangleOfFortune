package rectangleoffortune;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class MainMenuView implements Serializable {
    private final static String[][] menuItems = {
        {"1", "1 Player Practice Game"},
        {"2", "2 Player Game"},
        {"3", "3 Player Game"},
//        {"G", "Game Menu"},
        {"H", "Help Menu"},
        {"X", "Exit Rectangle of Fortune"},
    };
    
    // Create instance of the MainMenuControl class
//    private MainMenuControl mainMenuControl = new MainMenuControl();
    
//     display the main menu and get input selection from user
    public static void getInput() {                 
        String command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        
        do {
            
            display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                case "2":
                case "3":
                    MainMenuControl.displayGame(Integer.parseInt(command));
                    break;
                case "H":
                    MainMenuControl.displayHelpMenu();
                    break;
                case "X": 
                    break;
                default: 
                    Messages.displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));  
        
         return;
    }
    
//         displays the help menu
    public static final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
