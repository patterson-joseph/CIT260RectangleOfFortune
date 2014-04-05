/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.models;

import BYUI.CIT260.RectangleOfFortune.exceptions.RectangleOfFortuneException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dustin
 */

public class Puzzle implements Serializable {
    private String puzzleText;
    protected int remainingLetters = 0;
    private Letter[] currentPuzzle;
    private final List<String> puzzleList;
    private int wordCount;

    public Puzzle() {
        puzzleList=new ArrayList();
        populatePuzzleList();
        wordCount=1;
        selectNewPuzzle();
    }
    public final void selectNewPuzzle() {
        //random puzzle picker
        int highNum = puzzleList.size(); //highest number needed
        int i; // to keep track of the index
        i = getRandomNumber(highNum); //generate the random number
        puzzleText = (puzzleList.get(i)); //pick the random puzzle from the array
        this.puzzleList.remove(i); //remove the puzzle so we don't use it again during this game
        //create the array of letters
        currentPuzzle = (new Letter[getPuzzleText().length()]);
        //populate the array with each letter object
        for (i = 0; i <= getPuzzleText().length() - 1; i++) {
            char letter = puzzleText.charAt(i);
            currentPuzzle[i] = new Letter(letter);
            if (letter==' ') {
                this.wordCount++;
            }
        }
    }

    private int getRandomNumber(int highNum) {
        //returns an int between 1 and the number provided
        Random rand = new Random();
        int i;
        i = rand.nextInt(highNum);
        return i;
    }    
    
    public void makeWinningPuzzleVisible() {
        //make all letters in the puzzle visible
        for (Letter letter : getCurrentPuzzle()) {
            letter.setIsVisible((Boolean) true);
        }
//        this.puzzleTextToDisplay();
    }

    public int countLetters (char letter){// throws RectangleOfFortuneException {
        int count = 0;
//        if (!Character.isLetter(letter) || this.getPuzzleText().trim().isEmpty()) {
////            System.out.print("Invalid letter or puzzle given!");
//            throw new RectangleOfFortuneException("Invalid letter or puzzle given!");
////            return -1;
//        }
        for (int i = 0; i < this.getPuzzleText().length(); i++) {
            if (this.getPuzzleText().charAt(i) == letter) {
                if (!this.currentPuzzle[i].getIsVisible()) {
                    getCurrentPuzzle()[i].setIsVisible((Boolean) true);
                    count++;
                }
            }
        }
        remainingLetters = (remainingLetters - count);
        return (byte) count;
    }

    /**
     * @return the puzzleText
     */
    public String getPuzzleText() {
        return puzzleText;
    }

    protected final void populatePuzzleList() {
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

    /**
     * @return the currentPuzzle
     */
    public Letter[] getCurrentPuzzle() {
        return currentPuzzle;
    }

    /**
     * @return the wordCount
     */
    public int getWordCount() {
        return wordCount;
    }
 
    public int getWordEndPosition(int startWordPosition) {
        int wordEndingPosition=currentPuzzle.length;
        for(int i=startWordPosition-1;i<=currentPuzzle.length-1;i++){
            if (currentPuzzle[i].getValue()==' ') {
                wordEndingPosition=i;
                break;
            }
        }
        return wordEndingPosition;
    }
}