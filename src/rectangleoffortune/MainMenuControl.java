package rectangleoffortune;

import java.io.Serializable;

/**
 * @author Joseph/Dustin
 */
public class MainMenuControl implements Serializable {
    
    public static void display1PlayerGame() {
        Game game = new Game(1);
        GameMenuView gameMenu=new GameMenuView(game);
        game.player1.playerName=gameMenu.getPlayerName(1);
        gameMenu.getInput();
    }
    
    public static void display2PlayerGame() {
        Game game = new Game(2);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.playerName = gameMenu.getPlayerName(1);
        game.player2.playerName = gameMenu.getPlayerName(2);
        gameMenu.getInput();
    }    

    public static void display3PlayerGame() {
        Game game = new Game(3);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.playerName = gameMenu.getPlayerName(1);
        game.player2.playerName = gameMenu.getPlayerName(2);
        game.player3.playerName = gameMenu.getPlayerName(3);
        gameMenu.getInput();   
    }

    public static void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }    
}
