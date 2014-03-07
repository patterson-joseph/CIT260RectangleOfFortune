package rectangleoffortune;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class MainMenuControl implements Serializable {
    
    public static void display1PlayerGame() {
        Game game = new Game(1);
        GameMenuView gameMenu=new GameMenuView(game);
        game.player1.setPlayerName(getPlayerName(1));
        gameMenu.getInput();
    }
    
    public static void display2PlayerGame() {
        Game game = new Game(2);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.setPlayerName(getPlayerName(1));
        game.player2.setPlayerName(getPlayerName(2));
        gameMenu.getInput();
    }    

    public static void display3PlayerGame() {
        Game game = new Game(3);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.setPlayerName(getPlayerName(1));
        game.player2.setPlayerName(getPlayerName(2));
        game.player3.setPlayerName(getPlayerName(3));
        gameMenu.getInput();   
    }

    public static void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    public static String getPlayerName(int playerNumber) {
        System.out.println();
        Messages.displayMessage("Player " + playerNumber + ", please enter your name");
        String name;
        Scanner inString = RectangleOfFortune.getInputFile();
        name=inString.nextLine().trim().toUpperCase();
        return name;
    } 
}
