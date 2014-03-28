package BYUI.CIT260.RectangleOfFortune.views;

import BYUI.CIT260.RectangleOfFortune.Enums.ErrorTypes;
import BYUI.CIT260.RectangleOfFortune.Enums.GameMenuItems;
import BYUI.CIT260.RectangleOfFortune.models.Game;
import BYUI.CIT260.RectangleOfFortune.menu.controls.GameMenuControl;
import BYUI.CIT260.RectangleOfFortune.models.Player;
import BYUI.CIT260.RectangleOfFortune.menu.controls.RectangleOfFortune;
import static java.lang.Integer.parseInt;
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
        
        //ask for and set number of rounds
        game.setNumberOfRounds(getNumberOfRounds());
        
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
                        Messages.displayMessage(GameMenuItems.LOWBALANCE.getText());
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
                            + GameMenuItems.EXITMESSAGE.getText());
                        command = "Q";
                    } else {
                        Messages.displayMessage(GameMenuItems.WRONGGUESS.getText());
                    }
                    break; 
                case "C":
                    GameMenuControl.showCurrentPlayerStanding(game.getPlayerList());
                    break;
                case "V":
                    GameMenuControl.changePuzzleView(game);
                    Messages.displayMessage(GameMenuItems.VIEWCHANGED.getText());
                case "Q":
                    break;
            }
        } while (!command.equals("Q"));
        
        return command;
    }    
    
    private int getNumberOfRounds() {
        int command;
        boolean valid=false;
       
        do {
            Messages.displayMessage(GameMenuItems.ROUNDPROMPT.getText() + " "
                + GameMenuItems.ROUNDLIMIT.getText());
            command=this.getIntCommand();
            if (command>=1 && command<=5) {
                valid=true;
            }else {
                Messages.displayLine("\t" + ErrorTypes.ROUNDCOUNTERROR.getText());
            }
        } while (!valid);
        return command;
    }
    
    private String getPlayerName(int playerNumber) {
        System.out.println();
        Messages.displayMessage("Player " + playerNumber + ", " 
                + GameMenuItems.NAMEPROMPT.getText());
        String name;
        Scanner inString = RectangleOfFortune.getInputFile();
        name=inString.nextLine().trim().toUpperCase();
        return name;
    } 
              
}