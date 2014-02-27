package rectangleoffortune;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuControl  {
    
    public GameMenuControl() {
        
    } 
        
    public void spin(Game game) {
        game.spinner.spinnerLocation = new Random().nextInt(game.spinner.spinnerValues.length);
        
        displayBorder();
        System.out.println(
            "\tEach letter is worth $" 
            + game.spinner.spinnerValues[game.spinner.spinnerLocation]
        );
        displayBorder();
        
        game.puzzle.displayPuzzle();
        GuessALetterView guessLetter = new GuessALetterView();
        char guessedLetter = guessLetter.getInput(guessLetter.consonants);
        
        int count = game.puzzle.countLetters(guessedLetter);        
        
        if(count > 0){
            game.getCurrentPlayer().playerBank_Round += count*game.spinner.spinnerValues[game.spinner.spinnerLocation];           
            displayBorder();
            System.out.println("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().playerBank_Round);
            displayBorder();
        } else {
            displayBorder();
            System.out.println("\tLetter not found in puzzle or was already guessed!");
            displayBorder();
            game.changeCurrentPlayerTurn();
        }
        
        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();
    }
    
    public void buyAVowel(Game game) {        
        game.puzzle.displayPuzzle();
        GuessALetterView guessLetter = new GuessALetterView();
        char guessedLetter = guessLetter.getInput(guessLetter.vowels);
        
        int count = game.puzzle.countLetters(guessedLetter);  
        
        if(count > 0){
            game.getCurrentPlayer().playerBank_Round -= 250;
            displayBorder();
            System.out.println("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().playerBank_Round);
            displayBorder();
        } else {
            displayBorder();
            System.out.println("\tLetter not found in puzzle or was already guessed!");
            displayBorder();
            game.changeCurrentPlayerTurn();
        }
        
        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();
    }
          
    public void solveThePuzzle() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "\tThis function will be used to solve the puzzle."
                ); 
        displayBorder();
    }
    
    public void promptForPlayerName(int playerNumber) {
        System.out.println();
        displayBorder();
        System.out.println("Player " + playerNumber + ", please enter your name");
        
    }
    public void displayBorder() {       
        System.out.println(
        "\t===============================================================");
    }
}
