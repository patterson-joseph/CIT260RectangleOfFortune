package rectangleoffortune;

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
        {"Q", "Quit Game"}
    };
    
    public GameMenuView(int numberOfPlayers){
        super(GameMenuView.menuItems);
        GameMenuView.game = new Game(numberOfPlayers);
    }

    @Override
    public String executeCommands(){
        String command;
        
        for(int i=0;i<GameMenuView.game.getNumberOfPlayers();i++){
            game.getPlayerList()[i].setPlayerName(GameMenuView.getPlayerName(i+1));
        }
        
        do {
            game.getPuzzle().displayPuzzle();
            this.display();
            
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
                        game.getPuzzle().showWinningPuzzle();
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
                case "Q":
                    break;
                default: 
                    Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
        
        return command;
    }    
    
    private static String getPlayerName(int playerNumber) {
        System.out.println();
        Messages.displayMessage("Player " + playerNumber + ", please enter your name");
        String name;
        Scanner inString = RectangleOfFortune.getInputFile();
        name=inString.nextLine().trim().toUpperCase();
        return name;
    } 
        
}