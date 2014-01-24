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
    public static void main(String[] args) {
        // TODO code application logic here
        String playerName = "Default User";
        float playerBank = 0;
        int wins = 0;
        int losses = 0;
        
        Player player = new Player();
        player.displayName(playerName);
        player.displayBank(playerBank);
        player.displayWins(wins);
        player.displayLosses(losses);
    }
    
    void displayName(String name){
        System.out.print(name);
    }
    
    void displayBank(float bank){
        System.out.print(bank);
    }
    
    void displayWins(int wins){
        System.out.print(wins);
    }
    
    void displayLosses(int losses){
        System.out.print(losses);
    }
}
