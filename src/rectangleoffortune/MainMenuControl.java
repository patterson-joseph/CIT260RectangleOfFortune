package rectangleoffortune;

import java.io.Serializable;

/**
 * @author Joseph/Dustin
 */
public class MainMenuControl implements Serializable {
    
    public static void displayGame(int numberOfPlayers) {
        GameMenuView gameMenu=new GameMenuView(numberOfPlayers);
        GameMenuView.getInput();
    }

    public static void displayHelpMenu() {
        HelpMenuView.getInput();
    }
    
}
