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
        
        RectangleOfFortune myGame = new RectangleOfFortune();
        myGame.displayIntro();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        
//        HelpMenuView helpMenu = new HelpMenuView();
//        helpMenu.getInput();
        
               
        // TODO code application logic here
//        String dustinCrossley = "Dustin Crossley";
//        String josephPatterson = "Joseph Patterson";
        
//        RectangleOfFortune name = new RectangleOfFortune();      
//        name.displayDustin(dustinCrossley);
//        name.displayJoseph(josephPatterson);
        
//        Player player = new Player();
//        player.displayName(dustinCrossley);    
        
        myGame.getName();
        
        Player player = new Player();
        player.displayName();
        player.displayBank();
        player.displayWins();
        player.displayLosses();
        
        Board currentBoard = new Board();
        currentBoard.displayBoardWidth();
        currentBoard.displayBoardHeight();
        
        Game game = new Game();
        game.getPuzzleText();
        game.getPuzzleLength();    
        game.showCurrentPlayerTurn();
        game.showRemainingVowels();
        game.puzzleText="Lazy River";
        int iNumCorrectLetters = game.getNumberOfLettersGuessed("r");
    
    }
    
    void displayDustin(String name){
        System.out.print(name);
    }
    
    void displayJoseph(String name){
        System.out.print(name);
    }
    
    void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter your name: ");
        this.playerName = input.next();
    }
    
    public void displayIntro() {
        System.out.println("\nWelcome!"); // + this.playerName + 
        System.out.println(this.instructions);
    }
}
