package BYUI.CIT260.RectangleOfFortune.menu.views;

import BYUI.CIT260.RectangleOfFortune.models.Game;
import BYUI.CIT260.RectangleOfFortune.menu.controls.GameMenuControl;
import BYUI.CIT260.RectangleOfFortune.models.Player;
import rectangleoffortune.Menu;
import rectangleoffortune.Messages;
import rectangleoffortune.RectangleOfFortune;
import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuView extends Menu {
    private static Game game;
    private final static String[][] menuItems = {
        {"S", "Spin"},
        {"B", "Buy a Vowel"},
        {"P", "Solve the puzzle"},
        {"C", "Current Player Bank Standing"},
        {"V", "Toggle puzzle view mode"},
        {"Q", "Quit Game"}
    };
    private final Player playerList[];
    
    public GameMenuView(int numberOfPlayers){
        super(GameMenuView.menuItems);
        GameMenuView.game = new Game();
        GameMenuView.game.setPlayerCount(numberOfPlayers);
        //instance the correct number of players
        
        playerList=new Player[numberOfPlayers];   //declare the array
        for(int i=0;i<numberOfPlayers;i++){
            playerList[i]=new Player(i+1);      //add players
        }
        
        GameMenuView.game.setPlayerList(playerList);
    }

//    @Override
    public String executeCommands(){
        String command;
        
        for(int i=0;i<GameMenuView.game.getNumberOfPlayers();i++){
            game.getPlayerList()[i].setPlayerName(this.getPlayerName(i+1));
        }
        
        do {
            game.displayPuzzle();
            this.display(game.getCurrentPlayer());
            
            // get commaned entered
            command = this.getCommand();
            
            switch (command) {
                case "S":
                    GameMenuControl.spin(game);
                    break;
                case "B":
                    if(game.getCurrentPlayer().getPlayerRoundBank() >= 250){
                        GameMenuControl.buyAVowel(game);
                    } else {
                        Messages.displayMessage("Not enough money to buy a vowel!");
                    }
                    break;
                case "P":
                    boolean result = GameMenuControl.solveThePuzzle(game);
                    if(result){
                        Messages.displayMessage(game.getCurrentPlayer().getPlayerName() 
                                + " wins! $" + game.getCurrentPlayer().getPlayerRoundBank()
                                + " in total winnings.");
                        game.getPuzzle().makeWinningPuzzleVisible();
                        game.displayPuzzle();
                        Messages.displayMessage("Total turns played: "
                            + game.getTotalNumberOfTurns() + "."
                            + " Thanks for playing!");
                        command = "Q";
                    } else {
                        Messages.displayMessage("Sorry that is incorrect!");
                    }
                    break; 
                case "C":
                    GameMenuControl.showCurrentPlayerStanding(game.getPlayerList());
                    break;
                case "V":
                    GameMenuControl.changePuzzleView(game);
                    Messages.displayMessage("Puzzle view changed");
                case "Q":
                    break;
                default: 
                    Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
        
        return command;
    }    
    
    private String getPlayerName(int playerNumber) {
        System.out.println();
        Messages.displayMessage("Player " + playerNumber + ", please enter your name");
        String name;
        Scanner inString = RectangleOfFortune.getInputFile();
        name=inString.nextLine().trim().toUpperCase();
        return name;
    } 
              
}