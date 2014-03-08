package rectangleoffortune;

import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class HelpMenuView  {
        
    private final static String[][] menuItems = {
        {"G", "Rectangle of Fortune Game"},
        {"R", "Rectangle"},
        {"C", "Computer Player"},
        {"T", "Turn, what happens on your turn"},
        {"P", "Puzzle"},
        {"B", "Bank"},
        {"Q", "Quit Help"}
    };
    
    // display the help menu and get the end users input selection
    public static void getInput() {       
              
        String command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        
        do {
            
            HelpMenuView.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "G":
                    HelpMenuControl.displayGameHelp();
                    break;
                case "R":
                    HelpMenuControl.displayRectangleHelp();
                    break;
                case "C":
                    HelpMenuControl.displayComputerHelp();
                    break;                  
                case "T":
                    HelpMenuControl.displayTurnHelp();
                    break;
                case "P":
                    HelpMenuControl.displayPuzzleHelp();
                    break;
                 case "B":
                    HelpMenuControl.displayBankHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    public static final void display() {
        String menuText = "\tEnter the letter associated with one of the following commands:";
        for (String[] menuItem : HelpMenuView.menuItems) {
            menuText += "\n\t" + menuItem[0] + "\t" + menuItem[1];
        }
        Messages.displayMessage(menuText);
    }  
}