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
    String playerName = "Default User";
    int playerBank = 500;
    int wins = 2;
    int losses = 1;
    
    
   
    public void displayName(){
        System.out.println("Player name is: " + playerName + ".");
    }
    
    public void displayBank(){
        System.out.println("Player has $" + playerBank + " in the bank.");
    }
    
    public void displayWins(){
        System.out.println("Player has won " + wins + " games.");
    }
    
    public void displayLosses(){
        System.out.println("Player has lost " + losses + " games.");
    }
    
   public boolean updatePlayerBank(int letterValue
            , byte numberOfCorrectLetters) {
       
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
       if (playerBank < 0) {
           System.out.println("Invalid player bank amount: \n"
                   + "\t" + playerBank);
           return false;
       }
       
       playerBank += letterValue*numberOfCorrectLetters;
       byte castingTest = (byte)playerBank;
       return true;
    }
}
