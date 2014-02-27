/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Joseph
 */
public class Player {
    String playerName; // = "Default User";
//    String playerType; // Person or Computer
    int playerNumber; // where the player is in the lineup of other players
    int playerBank_Round; // total won for the round
    int playerBank_Game; //total won during the game
    int wins; // = 2;
    int losses; // = 1;
    
Player(int playerNumber) {
    playerBank_Round=0;
    playerBank_Game=0;
    wins=0;
    losses=0;
    this.playerNumber=playerNumber;
    this.playerName="Player" + playerNumber;
}
   
    public void displayName(){
        System.out.println("Player name is: " + playerName + ".");
    }
    
    public void displayBank(){
        System.out.println("Player has $" + playerBank_Round + " in the bank.");
    }
    
    public void displayWins(){
        System.out.println("Player has won " + wins + " games.");
    }
    
    public void displayLosses(){
        System.out.println("Player has lost " + losses + " games.");
    }
    
   public boolean updatePlayerBank(int letterValue
            , int numberOfCorrectLetters) {
       
       if (letterValue < 0) {
           System.out.println("Invalid letter value: \n"
                   + "\t" + letterValue);
           return false;
       }
       if (numberOfCorrectLetters < 0) {
           System.out.println("Invalid number of letters: \n"
                    + "\t" + numberOfCorrectLetters);
           return false;
       }
       if (playerBank_Round < 0) {
           System.out.println("Invalid player bank amount: \n"
                   + "\t" + playerBank_Round);
           return false;
       }
       
       playerBank_Round += letterValue*numberOfCorrectLetters;
       return true;
    }
}
