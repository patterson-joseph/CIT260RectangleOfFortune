package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuControl  {
    public static void spin(Game game) {
        game.getSpinner().spin(); 
        Messages.displayMessage("\tEach letter is worth $" + game.getSpinner().getCurrentSpinValue());
        
        game.displayPuzzle();
        GuessAConsonant guessAConsonant = new GuessAConsonant();
        char guessedLetter = guessAConsonant.getInput();
        
        int count = game.getPuzzle().countLetters(guessedLetter);        
        
        if(count > 0){
            game.getCurrentPlayer().setPlayerRoundBank(game.getSpinner().getCurrentSpinValue(),count);           
            Messages.displayMessage("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().getPlayerRoundBank());
        } else {
            Messages.displayMessage("\tLetter not found in puzzle or was already guessed!");
            game.changeCurrentPlayerTurn();
        }
    }
    
    public static void buyAVowel(Game game) {        
        game.displayPuzzle();
        GuessAVowel guessAVowel = new GuessAVowel();
        char guessedLetter = guessAVowel.getInput();
        
        int count = game.getPuzzle().countLetters(guessedLetter);  
        
        if(count > 0){
            game.getCurrentPlayer().setPlayerRoundBank(-250,1);
            Messages.displayMessage("\tThere are " + count + " " + guessedLetter + "'s. Your bank total is now: $" + game.getCurrentPlayer().getPlayerRoundBank());
        } else {
            Messages.displayMessage("\tLetter not found in puzzle or was already guessed!");
            game.changeCurrentPlayerTurn();
        }
    }
          
    public static boolean solveThePuzzle(Game game) {
        game.displayPuzzle();
        Messages.displayMessage("Please enter your guess!");
        Scanner inFile = RectangleOfFortune.getInputFile();
        String command;
        
        command = inFile.nextLine();
        command = command.trim().toUpperCase();
        
        if(command.equals(game.getPuzzle().getPuzzleText())){
            return true;
        } else {
            return false;
        }
    }
    
    public static void showCurrentPlayerStanding(Player[] playerList) {
        //sort player list by bank amount, highest to lowest
        //using insertion sort method

        Player tempArray[] = playerList;
                   
        int j;      //number of items sorted so far
        Player key;    // the item to be inserted
        int i;

        if (tempArray==null) {
            System.out.println("Missing or corrupt player array!");
        } else {
            for(j=1;j<tempArray.length;j++) { // start with base 1 counting
                key=tempArray[j]; // remember which array starts in the first position
                
                for(i=j-1;(i>=0) && (tempArray[i].getPlayerRoundBank()<key.getPlayerRoundBank());i--) { //i is still >=0 AND player[i].bankamount<player[1].bankamount)
                    tempArray[i+1]=tempArray[i]; //amount is less, so move the small value up
                }
                
                tempArray[i+1]=key; //make sure the  to put the key in the correct location
            }

            // tempArray is now sorted highest bank amount to lowest, so display it
            System.out.println(
            "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (i=0;i<tempArray.length;i++) {
                System.out.println("\t\t" + tempArray[i].getPlayerName()
                + " is in " + placeRank(i) + " place with $"
                + tempArray[i].getPlayerRoundBank());
            }
            System.out.println(
            "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    private static String placeRank(int rank) {
        String place="";
        switch(rank){
            case 0:
                place= "First";
                break;
            case 1:
                place= "Second";
                break;
            case 2:
                place= "Third";
        }
        return place;
    }
}