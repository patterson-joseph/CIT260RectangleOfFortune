package rectangleoffortune;

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
    @Override
    public String executeCommands(){
        String command;
        do {            
            this.display();
            
            // get commaned entered
            command = this.getCommand();
            
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
        
        return command;
    }
}