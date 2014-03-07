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
    
    // Create instance of the HelpMenuControl (action) class
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                case "R":
                    this.helpMenuControl.displayRectangleHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerHelp();
                    break;                  
                case "T":
                    this.helpMenuControl.displayTurnHelp();
                    break;
                case "P":
                    this.helpMenuControl.displayPuzzleHelp();
                    break;
                 case "B":
                    this.helpMenuControl.displayBankHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    public final void display() {
        String menuText = "\tEnter the letter associated with one of the following commands:";
        for (String[] menuItem : HelpMenuView.menuItems) {
            menuText += "\n\t" + menuItem[0] + "\t" + menuItem[1];
        }
        Messages.displayMessage(menuText);
    }  
}