package BYUI.CIT260.RectangleOfFortune.models;

import java.io.Serializable;

/**
 *
 * @author Joseph/Dustin
 */
public class Player implements Serializable {
    private String playerName; // = "Default User";
    private int playerRoundBank; // total won for the round
    private int playerGameBank; //total won during the game
    private int wins; // = 2;
    private int losses; // = 1;
    
    public Player(int playerNumber) {
        wins=0;
        losses=0;
        this.playerName="Player" + playerNumber;
    }
   
    public String getPlayerName(){
        return playerName;
    }
    
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    
    public int getPlayerRoundBank(){
        return playerRoundBank;
    }
    
    public int getPlayerGameBank(){
        return playerGameBank;
    }
    
    public boolean setPlayerGameBank(int deposit) {
       playerGameBank += deposit;
       return true;
    }
    
   public boolean setPlayerRoundBank(int letterValue
            , int numberOfCorrectLetters) {
       if (numberOfCorrectLetters < 0) {
           System.out.println("Invalid number of letters: \n"
                    + "\t" + numberOfCorrectLetters);
           return false;
       }
       if (playerRoundBank < 0) {
           System.out.println("Invalid player bank amount: \n"
                   + "\t" + playerRoundBank);
           return false;
       }
       
       playerRoundBank += letterValue*numberOfCorrectLetters;
       return true;
    }
}
