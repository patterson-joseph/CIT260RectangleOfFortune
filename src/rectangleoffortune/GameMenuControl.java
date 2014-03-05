package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuControl  {
    
    public GameMenuControl() {
        
    } 
        
    public void spin(Game game) {
//        game.spinner.setSpinnerLocation(new Random().nextInt(game.spinner.getSpinnerValues().length));
        
        game.spinner.spin(); 
        new Messages().displayMessage("\tEach letter is worth $" + game.spinner.getCurrentSpinValue());
        
        game.puzzle.displayPuzzle();
        GuessALetterView guessLetter = new GuessALetterView();
        char guessedLetter = guessLetter.getInput(guessLetter.consonants);
        
        int count = game.puzzle.countLetters(guessedLetter);        
        
        if(count > 0){
            game.getCurrentPlayer().playerBank_Round += count*game.spinner.getCurrentSpinValue();           
            new Messages().displayMessage("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().playerBank_Round);
        } else {
            new Messages().displayMessage("\tLetter not found in puzzle or was already guessed!");
            game.changeCurrentPlayerTurn();
        }
    }
    
    public void buyAVowel(Game game) {        
        game.puzzle.displayPuzzle();
        GuessALetterView guessLetter = new GuessALetterView();
        char guessedLetter = guessLetter.getInput(guessLetter.vowels);
        
        int count = game.puzzle.countLetters(guessedLetter);  
        
        if(count > 0){
            game.getCurrentPlayer().playerBank_Round -= 250;
            new Messages().displayMessage("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().playerBank_Round);
        } else {
            new Messages().displayMessage("\tLetter not found in puzzle or was already guessed!");
            game.changeCurrentPlayerTurn();
        }
    }
          
    public boolean solveThePuzzle(Game game) {
        game.puzzle.displayPuzzle();
        new Messages().displayMessage("Please enter your guess!");
        Scanner inFile = new Scanner(System.in);
        String command;
        
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        
        if(command.equals(game.puzzle.puzzleText)){
            return true;
        } else {
            return false;
        }
    }
    
    public void promptForPlayerName(int playerNumber) {
        System.out.println();
        new Messages().displayMessage("Player " + playerNumber + ", please enter your name");        
    }
}