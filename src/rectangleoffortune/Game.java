/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Dustin
 */
public class Game {
    //Re-named from CurrentRound to Game ~dustin
    int currentPlayerTurn=1;
    int remainingVowels=3;
    String puzzleText = "Hello World";
    int puzzleLength = puzzleText.length();

    public void getPuzzleLength() {
        System.out.println("Puzzle is: " + this.puzzleLength 
                + " characters long");
    }
    
    public void getPuzzleText() {
        System.out.println("Puzzle text is: '" + this.puzzleText + "'");
    }
    
    public void showCurrentPlayerTurn() {
        System.out.println("It is player " + currentPlayerTurn + "'s turn.");
    }
    public void showRemainingVowels() {
        System.out.println("There are " + remainingVowels 
                + " vowels remaining.");
    }

    public int getNumberOfLettersGuessed(String guessedLetter) {
        
        int numberOfHits = 0;
        boolean isConsonant = false;
        String consonants[]= {"B","C","D","F","G","H","J","K","L","M","N","P"
                            ,"Q","R","S","T","V","W","X","Y","Z"};
        double dRatio = 0;  //percentage of letters correctly guessed, as double
        int iRatio = 0;     //percentage of letters correctlyi guessed, as int
        for (String validLetter : consonants) {
            String guess = guessedLetter.toUpperCase();
            if (validLetter.equals(guess)) {
                isConsonant=true;
            }
        }
        
        if (isConsonant == false)    {
            System.out.println(guessedLetter + " is not a consonant.\n"
                    + "Please enter a \"consonant\".");
            return 0;
        }
        
        int puzzleLengthWithoutLetter = 0;
        puzzleLengthWithoutLetter=puzzleText.replace(guessedLetter, "").length();
        numberOfHits=puzzleLength - puzzleLengthWithoutLetter;
        
        dRatio=(double)numberOfHits/(double)puzzleLength;
        dRatio=dRatio*100;
        iRatio=(int)dRatio;
        System.out.println("Player guessed " + numberOfHits + " letters "
                + "correctly, " + iRatio + "% of the total.");
        return numberOfHits;
    }
}
