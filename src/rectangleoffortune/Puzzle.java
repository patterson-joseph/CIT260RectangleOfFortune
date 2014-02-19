/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Joseph/Dustin
 */
public class Puzzle {
    private String puzzleText;
    private int puzzleNumWords;
    int remainingLetters = 0;
    private Letter currentPuzzle[];
    int remainingVowels; //=3;
//    int puzzleLength; // = puzzleText.length();
       
    public Puzzle() {
        setUpNewPuzzle();
    }
    
    private void setUpNewPuzzle() {
        //hard coding puzzle for now, will need a random puzzle picker
        puzzleText = selectNewPuzzle();
        
        //create the array of letters
        currentPuzzle= new Letter[puzzleText.length()];
        int i;
        for(i=0;i<=puzzleText.length()-1;i++) {
            currentPuzzle[i]=new Letter(puzzleText.charAt(i));
        }

        //for testing
//        System.out.println("Puzzle Text is :" + puzzleText);
//        System.out.println("Puzzle characters are:");
//        for(Letter x: currentPuzzle) {
//            System.out.println("Letter: " + x.value + "\n\t"
//                    + "IsDisplayed? " + x.isVisible + "\n\t"
//                    + "IsSpace?" + x.isSpace + ".\n");
//        }
    }

    private String selectNewPuzzle() {
//        String newPuzzle="HANGMAN";
//        String newPuzzle="";
//        String newPuzzle="HAPPY DAY";
//        String newPuzzle="A FLOWER";
//        String newPuzzle="ON FIRE";
        String newPuzzle="JAVA PROGRAM";
        return newPuzzle;
    }
    
    public void displayPuzzle() {
        int i=0;
        if (currentPuzzle.length == 0) {
            System.out.println("Puzzle Not Found!");
            return;
        }
        for(i=0;i<currentPuzzle.length;i++) {
            if (currentPuzzle[i].isSpace) {
                System.out.print(" ");
            }
            else if (currentPuzzle[i].isVisible) {
                System.out.print(currentPuzzle[i].value);
            }
            else {
                System.out.print("?");
            }
        }
    }

    public void displayPuzzle2() {
        // alternate way of displaying the puzzle
        int puzzleRow=1; // which row we're working with, 2 rows total for now
        int colPosition=1; //which column, 12, 12
        int colCharStart=1; //which column to start on (to adjust for center)
        int charRow=1; //which row of the character build are we on, 3 total
        int numWords=1; // how many words are there in the puzzle
        
        String topBottom = "---|";
        String startLeft = "|";
        
        colCharStart = currentPuzzle.length >>> 1;
        for(Letter x: currentPuzzle) {
            System.out.print(startLeft);
            System.out.print(topBottom);
        }
        // next character line
        System.out.flush();
        colPosition=1;
        for(Letter x: currentPuzzle) {
            System.out.print(startLeft);
            if (colPosition==colCharStart) {
                System.out.print(" " + x.value + " ");
            }
            else {
                   System.out.print("   ");
            }
            
        }
        
        
    }
    
    public int countLetters(char letter){
        int count = 0;

        if(!Character.isLetter(letter) || this.puzzleText.trim().isEmpty()){
            System.out.print("Invalid letter or puzzle given!");
            return -1;
        }

        for (int i=0; i < this.puzzleText.length(); i++) {
            if (this.puzzleText.charAt(i) == letter) {
                count++;
                System.out.print("Letter " + letter + " found at position:\t" + i + "\n");
            } else {
                System.out.print("Letter " + letter + " not found at position:\t" + i + "\n");
            }
        }

        this.remainingLetters -= count; 

        return (byte) count;
    }    
    
    //moved from Game class ~dustin
    public void getPuzzleLength() {
        System.out.println("Puzzle is: " + puzzleText.length()
                + " characters long");
    }
    
    public void getPuzzleText() {
        System.out.println("Puzzle text is: '" + this.puzzleText + "'");
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
        numberOfHits=puzzleText.length() - puzzleLengthWithoutLetter;
        
        dRatio=(double)numberOfHits/(double)puzzleText.length();
        dRatio=dRatio*100;
        iRatio=(int)dRatio;
        System.out.println("Player guessed " + numberOfHits + " letters "
                + "correctly, " + iRatio + "% of the total.");
        return numberOfHits;
    }
}
