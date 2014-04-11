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
    private Word[] puzzleWords;

    public Puzzle() throws RectangleOfFortuneException{
        puzzleList=new ArrayList();
        populatePuzzleList();
        wordCount=1;
        selectNewPuzzle();
    }
    public final void selectNewPuzzle() throws RectangleOfFortuneException{
        //random puzzle picker
        int highNum = puzzleList.size(); //highest number needed
        int i; // to keep track of the index
        i = getRandomNumber(highNum); //generate the random number
        puzzleText = (puzzleList.get(i)); //pick the random puzzle from the array
        this.puzzleList.remove(i); //remove the puzzle so we don't use it again during this game
        
        //create the array of letters
        currentPuzzle = (new Letter[52]);
        determineWordCount();
        
        //initialize array
        for (int z=0;z<=51;z++){
            currentPuzzle[z]=new Letter(' ');
        }
                
        int y=0;
//        int word=1;
        
        switch (this.wordCount) {

            case 1:
                populatePuzzleInside(12,puzzleWords[0]);
                break;
            case 2:
                populatePuzzleInside(12,puzzleWords[0]);                
                populatePuzzleInside(26,puzzleWords[1]);
                break;
            case 3:
                populatePuzzleInside(0,puzzleWords[0]);
                populatePuzzleInside(12,puzzleWords[1]);
                populatePuzzleInside(26,puzzleWords[2]);
                break;
            case 4:
                populatePuzzleInside(0,puzzleWords[0]);
                populatePuzzleInside(12,puzzleWords[1]);
                populatePuzzleInside(26,puzzleWords[2]);
                populatePuzzleInside(40,puzzleWords[3]);                
        }
        

        
    }

    private void populatePuzzleInside(int startChar, Word currentWord) {
        int puzzleOrdinal=currentWord.getPuzzleOrdinal();
        for (int i=startChar;i<(startChar+currentWord.getWordLength());i++) {
//            if (!(puzzleText.charAt(currentPuzzleChar)==' ')) {
                currentPuzzle[i]=new Letter(puzzleText.charAt(puzzleOrdinal));
                puzzleOrdinal++;
//                currentPuzzleChar++;
//            } else {
//                currentPuzzleChar++;
//                break;
            }
//        }
//        return currentPuzzleChar;
    }
    
    private void determineWordCount() {
        for (int i=0; i<=getPuzzleText().length()-1;i++) {
            char letter = puzzleText.charAt(i);
            if (letter==' ') {
                this.wordCount++;
            }
        }
        
        puzzleWords=(new Word[this.wordCount]);
        int startNextWord=0;
        int wordNum=0;
        int wordLen=0;
        for (int i=0; i<=getPuzzleText().length()-1;i++) {
            char letter = puzzleText.charAt(i);
            wordLen++;
            if (letter==' ') {
                puzzleWords[wordNum]=new Word(wordNum+1,wordLen-1, startNextWord);
                wordNum++;
                wordLen=0;
                startNextWord=i;
                startNextWord++;
            }
        }
//        wordNum++;
        puzzleWords[wordNum]=new Word(wordNum+1,wordLen,startNextWord);
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
        for (Letter letter : currentPuzzle) {
            letter.setIsVisible(Boolean.TRUE);
        }
//        this.puzzleTextToDisplay();
    }

    public int countLetters (char letter){// throws RectangleOfFortuneException {
        int count = 0;
        for (Letter square : this.currentPuzzle) {
            if (square.getValue() == letter) {
                square.setIsVisible(Boolean.TRUE);
                count++;
            }
        }
//        remainingLetters = (remainingLetters - count);
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
            ,"PENCIL"
            ,"RECTANGLE OF FORTUNE"
            
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