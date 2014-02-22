/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Dustin
 */
public class Game {
//    private int numberOfPlayers;
    int currentPlayerNumberTurn;
    int totalNumberOfTurns;
//    private String currentPlayerName;
    Player player1;
    Player player2;
    Player player3;
    Puzzle puzzle;
    Player playerList[];
    
    Game(int playerCount) {
//        numberOfPlayers=playerCount;
        //instance the correct number of players
        switch (playerCount) {
            case 3:
                player3 = new Player();
                player3.playerBank=0;
                player3.playerName="Player3";
                player3.playerNumber=3;
            case 2:
                player2 = new Player();
                player2.playerBank=0;
                player2.playerName="Player2";
                player2.playerNumber=2;
            case 1:
                player1 = new Player();
                player1.playerBank=0;
                player1.playerName="Player1";
                player1.playerNumber=1;
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
//            Player playerList[]= new Player[]{player1, player2};              
        }
        else if(playerCount==3) {
            playerList=new Player[3];
            playerList[0]=player1;
            playerList[1]=player2;
            playerList[2]=player3;
        }
        
        //we'll start with player1
        this.currentPlayerNumberTurn=1;
        this.totalNumberOfTurns=1;
        // set up instance of puzzle class
        this.puzzle = new Puzzle();
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
    
//    /**
//     * @param currentPlayerName the currentPlayerName to set
//     */
//    public void setCurrentPlayerName(String currentPlayerName) {
//        this.currentPlayerName = currentPlayerName;
//    }

    public void showCurrentPlayerStanding() {
        //sort player list by bank amount, highest to lowest
        //attempting an insertion sort method

        Player tempArray[] = playerList;
                   
        int j;      //number of items sorted so far
        Player key;    // the item to be inserted
        int i;

        //assert(playerList!=null);
        if (tempArray==null) {
            System.out.println("Missing or corrupt player array!");
            return;
        }
        else {
            for(j=1;j<tempArray.length;j++) { // start with base 1 counting
                key=tempArray[j]; // remember which array starts in the first position
                for(i=j-1;(i>=0) && (tempArray[i].playerBank<key.playerBank);i--) { //i is still >=0 AND player[i].bankamount<player[1].bankamount)
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
                + tempArray[i].playerBank);
            }
            System.out.println(
            "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            
            return;
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
        
        switch (currentPlayerNumberTurn) {
            case 1:
                currentPlayerNumberTurn=2;
                break;
            case 2:
                currentPlayerNumberTurn=3;
                break;
            case 3:
                currentPlayerNumberTurn=1;
                break;
        }
            
}
    /**
     * @return the numberOfPlayers
     */
    public int getNumberOfPlayers() {
        return playerList.length;
    }

}
