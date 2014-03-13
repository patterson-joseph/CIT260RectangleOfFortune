package rectangleoffortune;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
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
    private final List<String> puzzleList;
       
    public Puzzle() {
        puzzleList=new ArrayList();
        populatePuzzleList();
        selectNewPuzzle();
    }
    
    public final void selectNewPuzzle() {
        //random puzzle picker
        int highNum = puzzleList.size(); //highest number needed
        int i; // to keep track of the index
        
        i = getRandomNumber(highNum);  //generate the random number
        puzzleText = (puzzleList.get(i)); //pick the random puzzle from the array
        this.puzzleList.remove(i); //remove the puzzle so we don't use it again during this game
        
        //create the array of letters
        currentPuzzle = (new Letter[getPuzzleText().length()]);

        //populate the array with each letter object
        for(i=0;i<=getPuzzleText().length()-1;i++) {
            currentPuzzle[i]=new Letter(puzzleText.charAt(i));
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
         puzzleList.addAll(Arrays.asList(list));
        
    }
    
    public String puzzleTextToDisplay() {
        String section="";
        String startLeft = "|"; //left side bars to start
        
        for(int i=1;i<4;i++){
            section += startLeft; //starting character
            for(Letter x: currentPuzzle) {
                //gather up requested section
                section+=(x.displayLetterSection(i));
            }
                //clear current line to start fresh on next line
            section+="\n";
//            System.out.println();
        }    
        return section;
    }
    
    public void makeWinningPuzzleVisible() {
        //make all letters in the puzzle visible
        
        for (Letter letter:currentPuzzle) {
            letter.setIsVisible((Boolean) true);
        }
        
        this.puzzleTextToDisplay();
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
                    currentPuzzle[i].setIsVisible((Boolean) true);
                    count++;
                }
            }
        }

        remainingLetters=(remainingLetters - count); 

        return (byte) count;
    }

    /**
     * @return the puzzleText
     */
    public String getPuzzleText() {
        return puzzleText;
    }
   
    /**
 * @author Joseph/Dustin
 */
private class Letter implements Serializable{
    private Boolean isVisible;
    private Boolean isSpace;
    private final char value;
        
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
        String str;
        if (this.getIsSpace()) {
            str=" ";
        }
        else if (this.getIsVisible()) {
            str=Character.toString(getValue());
        }
        else {
            str="?";
        }
        return str;
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
