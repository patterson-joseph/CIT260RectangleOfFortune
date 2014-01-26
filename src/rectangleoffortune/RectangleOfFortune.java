/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class RectangleOfFortune {
    String playerName;
    String instructions = "This is the game of Rectangle of Fortune. \n\n"
            + "You will be playing against 1 or 2 other players. \n"
            + "The object of the game is to solve the puzzle before \n"
            + "the other players.  Guessing a correct letter allows you \n"
            + "guess another letter or guess the puzzle. Press the spin \n"
            + "button to start your turn.  Player 1 goes first.\n\n";
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        String dustinCrossley = "Dustin Crossley";
        String josephPatterson = "Joseph Patterson";
        
        RectangleOfFortune name = new RectangleOfFortune();      
        name.displayDustin(dustinCrossley);
        name.displayJoseph(josephPatterson);
        
//        Player player = new Player();
//        player.displayName(dustinCrossley);    
        
        RectangleOfFortune myGame = new RectangleOfFortune();
        myGame.getName();
        myGame.displayHelp();
        
        Player player = new Player();
        player.displayName();
        player.displayBank();
        player.displayWins();
        player.displayLosses();
        
        Board currentBoard = new Board();
        currentBoard.getPuzzleText();
        currentBoard.getPuzzleLength();
        
        CurrentRound Round = new CurrentRound();
        Round.showCurrentPlayerTurn();
        Round.showRemainingVowels();
        
    }
    
    void displayDustin(String name){
        System.out.print(name);
    }
    
    void displayJoseph(String name){
        System.out.print(name);
    }
    
    void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.playerName = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.playerName + "\n");
        System.out.println(this.instructions);
    }
}