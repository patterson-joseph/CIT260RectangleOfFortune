package BYUI.CIT260.RectangleOfFortune.models;

import BYUI.CIT260.RectangleOfFortune.Interfaces.PuzzleInfo;
import BYUI.CIT260.RectangleOfFortune.exceptions.RectangleOfFortuneException;
import java.io.Serializable;
import BYUI.CIT260.RectangleOfFortune.views.PuzzleView_Large;
import BYUI.CIT260.RectangleOfFortune.views.PuzzleView_Small;

/**
 *
 * @author Dustin/Joseph
 */

public class Game implements Serializable{
    private int playerCount;
    private int currentPlayerNumberTurn;
    private int totalNumberOfTurns;
    
    private int currentRound;
    private int numberOfRounds;
    private int startOfRoundPlayerNumber;

    private final Puzzle puzzle;
    private final PuzzleView_Small viewPuzzle_Small;
    private final PuzzleView_Large viewPuzzle_Large;
    private Player playerList[];
    private final Spinner spinner = new Spinner();
    private PuzzleInfo puzzleInfo;
    
    // default constructor
    public Game() {
        // initialize variables
        this.currentPlayerNumberTurn=0;
        this.startOfRoundPlayerNumber=1;
        this.totalNumberOfTurns=1;      
        this.puzzle = new Puzzle();    
        this.viewPuzzle_Small = new PuzzleView_Small(puzzle);
        this.viewPuzzle_Large = new PuzzleView_Large(puzzle);
        puzzleInfo=viewPuzzle_Small;
        this.currentRound=1;            
    }
    
    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    
    public int getCurrentPlayerNumberTurn() {
        return currentPlayerNumberTurn;
    }

    public void setCurrentPlayerNumberTurn(int currentPlayerNumberTurn) {
        this.currentPlayerNumberTurn = currentPlayerNumberTurn;
    }
   
    public String getCurrentPlayerName() throws RectangleOfFortuneException {
//        String playerName="";
        
        if (getPlayerList()==null) {
//            System.out.println("Missing or corrupt player array!");
//            return playerName;
            throw new RectangleOfFortuneException("Missing or corrupt player array!");
        }
        
        if (getCurrentPlayerNumberTurn()<0 | getCurrentPlayerNumberTurn()>2) {
//            System.out.println("Invalid Player turn defined");
//            return playerName;
            throw new RectangleOfFortuneException("Invalid Player turn defined");
        }
        
        return getPlayerList()[getCurrentPlayerNumberTurn()].getPlayerName();
    }
    
    /**
     * @return the currentPlayerName
     * @throws BYUI.CIT260.RectangleOfFortune.exceptions.RectangleOfFortuneException
     */
    public Player getCurrentPlayer() throws RectangleOfFortuneException {
//        Player currentPlayer=new Player(1);
        
        if (getPlayerList()==null) {
//            System.out.println("Missing or corrupt player array!");
//            return currentPlayer;
            throw new RectangleOfFortuneException("Missing or corrupt player array!");
        }
        if (getCurrentPlayerNumberTurn()<0 | getCurrentPlayerNumberTurn()>2) {
//            System.out.println("Invalid Player turn defined");
//            return currentPlayer;
            throw new RectangleOfFortuneException("Invalid Player turn defined!");            
        }
        return getPlayerList()[getCurrentPlayerNumberTurn()];
    }
    
    public void changeCurrentPlayerTurn() {        
        if ((getCurrentPlayerNumberTurn()+1)==getNumberOfPlayers()) {
            //if we're on the last player, move back to the beginning of the list
            setCurrentPlayerNumberTurn(0);
        }
        else {
            //advance player turn by 1
            setCurrentPlayerNumberTurn(getCurrentPlayerNumberTurn() + 1);
        }
        //keep track of the number of turns
        this.totalNumberOfTurns++;            
    }
    
    /**
     * @return the numberOfPlayers
     */
    public int getNumberOfPlayers() {
        return getPlayerList().length;
    }

    public void advanceToNextRound(Player roundWinner) throws RectangleOfFortuneException{
        //reset for the next round

        //record the winner's totals into game totals
        roundWinner.setPlayerGameBank(roundWinner.getPlayerRoundBank());
        
        //record the win/loss stats
        for(Player player: getPlayerList()) {
//            if(player.playerNumber==roundWinner.playerNumber) {
//                player.wins++;
//            }
//            else {
//                player.losses++;
//            }
        }
        
        //reset player amounts
        for(Player player: getPlayerList()) {
            player.setPlayerRoundBank(0,0);
        }
        
        //pick a new puzzle
        getPuzzle().selectNewPuzzle();
        
        //set which player goes first
        this.changeStartRoundPlayer();
        
        //advance round counter
        this.currentRound++;
    }
    
    private void changeStartRoundPlayer() {
       
        if (startOfRoundPlayerNumber==getNumberOfPlayers()) {
            //if we're on the last player, move back to the beginning of the list
            startOfRoundPlayerNumber=1;
        }
        else {
            //advance start round player counter by 1
            startOfRoundPlayerNumber++;
        }
    }

    /**
     * @return the puzzle
     */
    public Puzzle getPuzzle() {
        return puzzle;
    }

    /**
     * @return the playerList
     */
    public Player[] getPlayerList() {
        return playerList;
    }

    /**
     * @return the spinner
     */
    public Spinner getSpinner() {
        return spinner;
    }

    /**
     * @return the totalNumberOfTurns
     */
    public int getTotalNumberOfTurns() {
        return totalNumberOfTurns;
    }

    public void changePuzzleView() {
        if (puzzleInfo.equals(this.viewPuzzle_Small)) {
            puzzleInfo=this.viewPuzzle_Large;
        }
        else {
            puzzleInfo=this.viewPuzzle_Small;
        }
//       switch (puzzleView){
//            case "Small":
//                puzzleView="Large";
//                puzzleInfo
//                break;
//            case "Large":
//                puzzleView="Small";
                
    }
    public void displayPuzzle() {
//        System.out.print(this.viewPuzzle.puzzleTextToDisplay());
        puzzleInfo.displayPuzzle();
//        switch (puzzleView){
//            case "Small":
//                this.viewPuzzle_Small.displayPuzzle();
//                break;
//            case "Large":
//                this.viewPuzzle_Large.displayPuzzle();
//        }
        
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }

    /**
     * @return the numberOfRounds
     */
    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    /**
     * @param numberOfRounds the numberOfRounds to set
     */
    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}