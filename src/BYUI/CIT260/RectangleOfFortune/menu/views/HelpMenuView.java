package BYUI.CIT260.RectangleOfFortune.menu.views;

import BYUI.CIT260.RectangleOfFortune.Enums.HelpMenuItems;
import rectangleoffortune.HelpMenuControl;
import rectangleoffortune.Menu;
import rectangleoffortune.Messages;

/**
 * @author Joseph/Dustin
 */
public class HelpMenuView extends Menu  {
    private final static String[][] menuItems = {
        {"G", "Rectangle of Fortune Game"},
        {"R", "Rectangle"},
        {"C", "Computer Player"},
        {"T", "Turn, what happens on your turn"},
        {"P", "Puzzle"},
        {"B", "Bank"},
        {"Q", "Quit Help"}
    };
    
    public HelpMenuView(){
        super(HelpMenuView.menuItems);
    }

    // display the help menu and get the end users input selection
//    @Override
    public String executeCommands(){
        String command;
        do {            
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            
            switch (command) {
                case "G":
                    Messages.displayMessage(HelpMenuItems.GAME.getHelpText());
                    break;
                case "R":
                    Messages.displayMessage(HelpMenuItems.RECTANGLE.getHelpText());
                    break;
                case "C":
                    Messages.displayMessage(HelpMenuItems.COMPUTER.getHelpText());
                    break;
                case "T":
                    Messages.displayMessage(HelpMenuItems.TURN.getHelpText());
                    break;
                case "P":
                    Messages.displayMessage(HelpMenuItems.PUZZLE.getHelpText());
                    break;
                case "B":
                    Messages.displayMessage(HelpMenuItems.BANK.getHelpText());
                    break;
                case "Q":
                    break;
                default:
                    Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
        
        return command;
    }
}