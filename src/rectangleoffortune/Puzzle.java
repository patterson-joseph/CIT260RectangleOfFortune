package rectangleoffortune;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Joseph/Dustin
 */
public class Puzzle implements Serializable{
    private String puzzleText;
    private int remainingLetters = 0;
    private Letter currentPuzzle[];
    private int remainingVowels;
    private List<String> puzzleList;
       
    public Puzzle() {
        puzzleList=new ArrayList();
        populatePuzzleList();
        selectNewPuzzle();
    }
    
    public void selectNewPuzzle() {
        //random puzzle picker
        int highNum = puzzleList.size(); //highest number needed
        int i; // to keep track of the index
        
        i = getRandomNumber(highNum);  //generate the random number
        setPuzzleText(this.puzzleList.get(i)); //pick the random puzzle from the array
        this.puzzleList.remove(i); //remove the puzzle so we don't use it again during this game
        
        //create the array of letters
        setCurrentPuzzle(new Letter[getPuzzleText().length()]);

        //populate the array with each letter object
        for(i=0;i<=getPuzzleText().length()-1;i++) {
            getCurrentPuzzle()[i]=new Letter(getPuzzleText().charAt(i));
        }
    }
    private int getRandomNumber(int highNum) {
        //returns an int between 1 and the number provided
        Random rand = new Random();
        int i;
        i = rand.nextInt(highNum);
        return i;
    }
    
    private void populatePuzzleList() {
         String list[] = {
            "MY FAIR LADY"
            ,"CRAZY EIGHTS"
            ,"BOOK WORM"
            ,"MY FUNNY VALENTINE"
            ,"FINANCIALLY SOUND PROOF"
            ,"GRANDMAS FEATHER BED"
            ,"BUTTERSCOTCH COOKIES"
            ,"COMPUTER ANIMATION"
            ,"GARDEN TOOLS"
            ,"BALANCING ACT"
            ,"MAKE A MENTAL NOTE"
            ,"FIRING ON ALL CYLINDERS"
            
        };
        
        //add all the items to the List, using a List so we can removing items later
        for(String string:list) {
            puzzleList.add(string);
        }
        
    }
    
    public void displayPuzzle() {
       
        String startLeft = "|";
        
        for(int i=1;i<4;i++){
            //left side bars to start
            System.out.print(startLeft);
            for(Letter x: getCurrentPuzzle()) {
                //print each section consecutively
                System.out.print(x.displayLetterSection(i));
            }
            //clear current line to start fresh on next line
            System.out.println();
        }         
    }
    
    public void showWinningPuzzle() {
        //make all letters in the puzzle visible
        
        for (Letter letter:getCurrentPuzzle()) {
            letter.setIsVisible((Boolean) true);
        }
        
        this.displayPuzzle();
    }
        
    public int countLetters(char letter){
        int count = 0;

        if(!Character.isLetter(letter) || this.getPuzzleText().trim().isEmpty()){
            System.out.print("Invalid letter or puzzle given!");
            return -1;
        }

        for (int i=0; i < this.getPuzzleText().length(); i++) {
            if (this.getPuzzleText().charAt(i) == letter) {
                if(!this.currentPuzzle[i].getIsVisible()){
                    this.getCurrentPuzzle()[i].setIsVisible((Boolean) true);
                    count++;
                }
            }
        }

        this.setRemainingLetters(this.getRemainingLetters() - count); 

        return (byte) count;
    }

    /**
     * @return the puzzleText
     */
    public String getPuzzleText() {
        return puzzleText;
    }

    /**
     * @param puzzleText the puzzleText to set
     */
    public void setPuzzleText(String puzzleText) {
        this.puzzleText = puzzleText;
    }

    /**
     * @return the remainingLetters
     */
    public int getRemainingLetters() {
        return remainingLetters;
    }

    /**
     * @param remainingLetters the remainingLetters to set
     */
    public void setRemainingLetters(int remainingLetters) {
        this.remainingLetters = remainingLetters;
    }

    /**
     * @return the currentPuzzle
     */
    public Letter[] getCurrentPuzzle() {
        return currentPuzzle;
    }

    /**
     * @param currentPuzzle the currentPuzzle to set
     */
    public void setCurrentPuzzle(Letter[] currentPuzzle) {
        this.currentPuzzle = currentPuzzle;
    }

    /**
     * @return the remainingVowels
     */
    public int getRemainingVowels() {
        return remainingVowels;
    }

    /**
     * @param remainingVowels the remainingVowels to set
     */
    public void setRemainingVowels(int remainingVowels) {
        this.remainingVowels = remainingVowels;
    }
    
    /**
 * @author Joseph/Dustin
 */
private class Letter implements Serializable{
    private Boolean isVisible;
    private Boolean isSpace;
    private char value;
        
    public Letter(char letter) {
    // default constructor
        isVisible=false;
        isSpace=false;
        value=letter;
        //determine whether a space or not
        if (' '==letter) {
            isSpace=true;
        }
    }

    public String displayLetterSection(int section) {
        // displays something like this:
        // ---|  = top row (section 1)
        //  A |  = middle row (section 2)
        // ---|  = bottom row (section 3)
        
        //Left side bars should already by taken care of
        //, resulting in letters that looks like this when put together:
        // |---|---|  = top row (section 1)
        // | A | B |  = middle row (section 2)
        // |---|---|  = bottom row (section 3)        

        String sectionDetail="";    
        switch (section) {
            case 1:
                sectionDetail = "---|";
                break;
            case 2:
                sectionDetail = " " + this.showToOutsideWorld() + " |";
                break;
            case 3:
                sectionDetail = "---|";
                break;
        }
        return sectionDetail;
    }

    private String showToOutsideWorld() {
        String string="";
        if (this.getIsSpace()) {
            string=" ";
        }
        else if (this.getIsVisible()) {
            string=Character.toString(getValue());
        }
        else {
            string="?";
        }
        return string;
    }

    /**
     * @return the isVisible
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * @param isVisible the isVisible to set
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * @return the isSpace
     */
    public Boolean getIsSpace() {
        return isSpace;
    }

    /**
     * @param isSpace the isSpace to set
     */
    public void setIsSpace(Boolean isSpace) {
        this.isSpace = isSpace;
    }

    /**
     * @return the value
     */
    public char getValue() {
        return value;
    }

}
}
