package rectangleoffortune;

import java.io.Serializable;

/**
 * @author Joseph/Dustin
 */
public class MainMenuControl implements Serializable {
    
    public static void displayGame(int numberOfPlayers) {
        GameMenuView gameMenu=new GameMenuView(numberOfPlayers);
        gameMenu.executeCommands();
    }

    public static void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.executeCommands();
    }
    
}
