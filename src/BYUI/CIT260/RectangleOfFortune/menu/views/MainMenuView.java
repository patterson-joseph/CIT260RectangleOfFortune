package BYUI.CIT260.RectangleOfFortune.menu.views;

import rectangleoffortune.MainMenuControl;
import rectangleoffortune.Menu;
import rectangleoffortune.Messages;

/**
 * @author Joseph/Dustin
 */
public class MainMenuView extends Menu {
    private final static String[][] menuItems = {
        {"1", "1 Player Practice Game"},
        {"2", "2 Player Game"},
        {"3", "3 Player Game"},
//        {"G", "Game Menu"},
        {"H", "Help Menu"},
        {"X", "Exit Rectangle of Fortune"},
    };
    
    // Create instance of the MainMenuView class
    public MainMenuView(){
        super(MainMenuView.menuItems);
    }
    
    //display the main menu and get input selection from user
//    @Override
    public String executeCommands(){
        String command;
        do {            
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            
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
        
         return command;
    }
}
