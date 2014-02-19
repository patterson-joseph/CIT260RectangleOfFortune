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
    int numberOfPlayers;
    int currentPlayerNumberTurn;
    private String currentPlayerName;
    Player player1;
    Player player2;
    Player player3;
    Puzzle puzzle;
    Player playerList[];
    
    Game(int playerCount) {
        numberOfPlayers=playerCount;
        //instance the correct number of players
        switch (numberOfPlayers) {
            case 3:
                player3 = new Player();
                player3.playerBank=11075;
            case 2:
                player2 = new Player();
                player2.playerBank=11050;
            case 1:
                player1 = new Player();
                player1.playerBank=3500;
        }
        
        //set up list of players
        if (numberOfPlayers==1) {
            //future use - setup computer player
            playerList=new Player[1];
            playerList[0]=player1;
        }
        else if(numberOfPlayers==2) {
            playerList=new Player[2];
            playerList[0]=player1;
            playerList[1]=player2;
//            Player playerList[]= new Player[]{player1, player2};              
        }
        else if(numberOfPlayers==3) {
            playerList=new Player[3];
            playerList[0]=player1;
            playerList[1]=player2;
            playerList[2]=player3;
        }
        
        //we'll start with player1
        currentPlayerNumberTurn=1;
        currentPlayerName="";
        // set up instance of puzzle class
        puzzle = new Puzzle();
    }
   
    public void showCurrentPlayerTurn() {
        System.out.println("It is player " + getCurrentPlayerName() + "'s turn.");
    }    

    /**
     * @return the currentPlayerName
     */
    public String getCurrentPlayerName() {
        switch (currentPlayerNumberTurn) {

            case 1:
                currentPlayerName= player1.playerName;
                break;
            case 2:
                currentPlayerName= player2.playerName;
                break;
            case 3:
                currentPlayerName= player3.playerName;
                break;
        }
        return currentPlayerName;
    }
    
    /**
     * @param currentPlayerName the currentPlayerName to set
     */
    public void setCurrentPlayerName(String currentPlayerName) {
        this.currentPlayerName = currentPlayerName;
    }

    public void showCurrentPlayerStanding() {
        //sort player list by bank amount, highest to lowest
        //attempting an insertion sort method
        Player tempArray[] = playerList;
                   
        int j;      //number of items sorted so far
        Player key;    // the item to be inserted
        int i;
        
        for(j=1;j<tempArray.length;j++) { // start with base 1 counting
            key=tempArray[j]; // remember which array is in the first position
            for(i=j-1;(i>=0) && (tempArray[i].playerBank<key.playerBank);i--) {
                tempArray[i+1]=tempArray[i];
            }
            tempArray[i+1]=key;
        }
        
        // tempArray is now sorted highest to lowest, so let's display it
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (i=0;i<tempArray.length;i++) {
            System.out.println("\t\t" + tempArray[i].playerName 
            + " is in " + placeRank(i) + " place with $"
            + tempArray[i].playerBank);
        }
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
}
