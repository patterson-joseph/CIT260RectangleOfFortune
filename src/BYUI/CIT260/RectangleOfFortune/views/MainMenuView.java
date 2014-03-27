package BYUI.CIT260.RectangleOfFortune.views;

import BYUI.CIT260.RectangleOfFortune.Enums.MainMenuItems;
import BYUI.CIT260.RectangleOfFortune.menu.controls.MainMenuControl;

/**
 * @author Joseph/Dustin
 */
public class MainMenuView extends Menu {
    private final static String[][] menuItems = {
        {"1", MainMenuItems.ONEPLAYER.getMainText()},
        {"2", MainMenuItems.TWOPLAYER.getMainText()},
        {"3", MainMenuItems.THREEPLAYER.getMainText()},
        {"H", MainMenuItems.HELPMENU.getMainText()},
        {"X", MainMenuItems.EXITGAME.getMainText()},
    };
    
    // Create instance of the MainMenuView class
    public MainMenuView(){
        super(MainMenuView.menuItems);
    }
    
    //display the main menu and get input selection from user
    public String executeCommands() {
        String command = "";
            
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
            }
        } while (!command.equals("X"));
        
         return command;
    }
}
