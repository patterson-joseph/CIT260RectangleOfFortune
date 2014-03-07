package rectangleoffortune;

import java.io.Serializable;

/**
 *
 * @author Dustin/Joseph
 */

public class Game implements Serializable{
    private int currentPlayerNumberTurn;
    private int totalNumberOfTurns;
    
    private int currentRound;
    private int startOfRoundPlayerNumber;

    private Puzzle puzzle;
    private Player playerList[];
    private Spinner spinner = new Spinner();
    
    // default constructor
    public Game(int playerCount) {
        //instance the correct number of players
        playerList=new Player[playerCount];   //declare the array
        for(int i=0;i<playerCount;i++){
            playerList[i]=new Player(i+1);      //add players
        }
               
        // initialize variables
        this.currentPlayerNumberTurn=0;
        this.startOfRoundPlayerNumber=1;
        this.totalNumberOfTurns=1;      
        this.puzzle = new Puzzle();     
        this.currentRound=1;            
    }
   
    /**
     * @return the currentPlayerName
     */
    public String getCurrentPlayerName() {
        String playerName="";
        
        if (getPlayerList()==null) {
            System.out.println("Missing or corrupt player array!");
            return playerName;
        }
        
        if (currentPlayerNumberTurn<0 | currentPlayerNumberTurn>2) {
            System.out.println("Invalid Player turn defined");
            return playerName;
        }
        
        return getPlayerList()[currentPlayerNumberTurn].getPlayerName();
    }
    
    /**
     * @return the currentPlayerName
     */
    public Player getCurrentPlayer() {
        Player currentPlayer=new Player(1);
        
        if (getPlayerList()==null) {
            System.out.println("Missing or corrupt player array!");
            return currentPlayer;
        }
        if (currentPlayerNumberTurn<0 | currentPlayerNumberTurn>2) {
            System.out.println("Invalid Player turn defined");
            return currentPlayer;
        }
        return getPlayerList()[currentPlayerNumberTurn];
    }
    
    public void changeCurrentPlayerTurn() {        
        if ((currentPlayerNumberTurn+1)==getNumberOfPlayers()) {
            //if we're on the last player, move back to the beginning of the list
            currentPlayerNumberTurn=0;
        }
        else {
            //advance player turn by 1
            currentPlayerNumberTurn++;
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

    public void advanceToNextRound(Player roundWinner) {
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
}
