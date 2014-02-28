package rectangleoffortune;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Joseph/Dustin
 */
public class Puzzle {
    public String puzzleText;
    private int puzzleNumWords;
    int remainingLetters = 0;
    Letter currentPuzzle[];
    int remainingVowels;
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
        puzzleText = this.puzzleList.get(i); //pick the random puzzle from the array
        this.puzzleList.remove(i); //remove the puzzle so we don't use it again during this game
        
        //create the array of letters
        currentPuzzle= new Letter[puzzleText.length()];

        //populate the array with each letter object
        for(i=0;i<=puzzleText.length()-1;i++) {
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
            for(Letter x: currentPuzzle) {
                //print each section consecutively
                System.out.print(x.displayLetterSection(i));
            }
            //clear current line to start fresh on next line
            System.out.println();
        }         
    }
    
    public void showWinningPuzzle() {
        //make all letters in the puzzle visible
        
        for (Letter letter:currentPuzzle) {
            letter.isVisible=true;
        }
        
        this.displayPuzzle();
    }
    
    public void displayPuzzle_Retired() {
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
    
    public int countLetters(char letter){
        int count = 0;

        if(!Character.isLetter(letter) || this.puzzleText.trim().isEmpty()){
            System.out.print("Invalid letter or puzzle given!");
            return -1;
        }

        for (int i=0; i < this.puzzleText.length(); i++) {
            if (this.puzzleText.charAt(i) == letter) {
                if(!this.currentPuzzle[i].isVisible){
                    this.currentPuzzle[i].isVisible = true;
                    count++;
                }
            }
        }

        this.remainingLetters -= count; 

        return (byte) count;
    }
}
