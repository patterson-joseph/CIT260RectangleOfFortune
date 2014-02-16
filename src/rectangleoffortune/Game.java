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
            case 2:
                player2 = new Player();
            case 1:
                player1 = new Player();
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
}
