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
    float playerBank = 500;
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
}
