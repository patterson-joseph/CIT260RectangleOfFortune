package rectangleoffortune;

/**
 *
 * @author Dustin/Joseph
 */

public class Game {
    int currentPlayerNumberTurn;
    int currentRound;
    int startOfRoundPlayerNumber;
    int totalNumberOfTurns;
//    Player currentPlayer;
    Player player1;
    Player player2;
    Player player3;
    Puzzle puzzle;
    Player playerList[];
    Spinner spinner = new Spinner();
    
    Game(int playerCount) {
        //instance the correct number of players
        switch (playerCount) {
            case 3:
                player3 = new Player(3);
            case 2:
                player2 = new Player(2);
            case 1:
                player1 = new Player(1);
        }
        
        //set up list of players
        if (playerCount==1) {
            //future use - setup computer player
            playerList=new Player[1];
            playerList[0]=player1;
        }
        else if(playerCount==2) {
            playerList=new Player[2];
            playerList[0]=player1;
            playerList[1]=player2;
        }
        else if(playerCount==3) {
            playerList=new Player[3];
            playerList[0]=player1;
            playerList[1]=player2;
            playerList[2]=player3;
        }
        
        //we'll start with player1
        this.currentPlayerNumberTurn=1;
        this.startOfRoundPlayerNumber=1;
        this.totalNumberOfTurns=1;
        // set up instance of puzzle class
        this.puzzle = new Puzzle();
        // start with round 1
        this.currentRound=1;
    }
   
    public void showCurrentPlayerTurn() {
        System.out.println("It is player " + getCurrentPlayerName() + "'s turn.");
    }    

    /**
     * @return the currentPlayerName
     */
    public String getCurrentPlayerName() {
        String playerName="";
        
        if (playerList==null) {
            System.out.println("Missing or corrupt player array!");
            return playerName;

        }
        
        if (currentPlayerNumberTurn<1 | currentPlayerNumberTurn>3) {
            System.out.println("Invalid Player turn defined");
            return playerName;
        }
        for(Player i: playerList) {
            if (i.playerNumber==this.currentPlayerNumberTurn) {
                playerName=i.playerName;
            }
        }

         return playerName;
    }
    
    /**
     * @return the currentPlayerName
     */
    public Player getCurrentPlayer() {
        Player currentPlayer=new Player(1);
        
        if (playerList==null) {
            System.out.println("Missing or corrupt player array!");
            return currentPlayer;
        }
        if (currentPlayerNumberTurn<1 | currentPlayerNumberTurn>3) {
            System.out.println("Invalid Player turn defined");
            return currentPlayer;
        }
        for(Player i: playerList) {
            if (i.playerNumber==this.currentPlayerNumberTurn) {
                currentPlayer=i;
            }
        }

         return currentPlayer;
    }
    
    public void showCurrentPlayerStanding() {
        //sort player list by bank amount, highest to lowest
        //using insertion sort method

        Player tempArray[] = playerList;
                   
        int j;      //number of items sorted so far
        Player key;    // the item to be inserted
        int i;

        if (tempArray==null) {
            System.out.println("Missing or corrupt player array!");
        } else {
            for(j=1;j<tempArray.length;j++) { // start with base 1 counting
                key=tempArray[j]; // remember which array starts in the first position
                
                for(i=j-1;(i>=0) && (tempArray[i].playerBank_Round<key.playerBank_Round);i--) { //i is still >=0 AND player[i].bankamount<player[1].bankamount)
                    tempArray[i+1]=tempArray[i]; //amount is less, so move the small value up
                }
                
                tempArray[i+1]=key; //make sure the  to put the key in the correct location
            }

            // tempArray is now sorted highest bank amount to lowest, so display it
            System.out.println(
            "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (i=0;i<tempArray.length;i++) {
                System.out.println("\t\t" + tempArray[i].playerName 
                + " is in " + placeRank(i) + " place with $"
                + tempArray[i].playerBank_Round);
            }
            System.out.println(
            "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    private String placeRank(int rank) {
        String place="";
        switch(rank){
            case 0:
                place= "First";
                break;
            case 1:
                place= "Second";
                break;
            case 2:
                place= "Third";
        }
        return place;
    }
    
    public void changeCurrentPlayerTurn() {        
        if (currentPlayerNumberTurn==getNumberOfPlayers()) {
            //if we're on the last player, move back to the beginning of the list
            currentPlayerNumberTurn=1;
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
        return playerList.length;
    }

    public void advanceToNextRound(Player roundWinner) {
        //reset for the next round

        //record the winner's totals into game totals
        roundWinner.playerBank_Game += roundWinner.playerBank_Round;
        
        //record the win/loss stats
        for(Player player: playerList) {
            if(player.playerNumber==roundWinner.playerNumber) {
                player.wins++;
            }
            else {
                player.losses++;
            }
        }
        
        //reset player amounts
        for(Player player: playerList) {
            player.playerBank_Round=0;
        }
        
        //pick a new puzzle
        puzzle.selectNewPuzzle();
        
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
}
