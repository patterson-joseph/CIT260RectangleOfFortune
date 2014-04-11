/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.models;

/**
 *
 * @author Crossley Family
 */
public class Word {
    private int wordOrder;
    private int wordLength;
    private int puzzleOrdinal;
//    final private Letter[] wordLetters;

    Word(int order, int length, int puzzleOrdinal){
        this.wordOrder=order;
        this.wordLength=length;
        this.puzzleOrdinal=puzzleOrdinal;
    }
    
    /**
     * @return the wordOrder
     */
    public int getWordOrder() {
        return wordOrder;
    }

    /**
     * @param wordOrder the wordOrder to set
     */
    public void setWordOrder(int wordOrder) {
        this.wordOrder = wordOrder;
    }

    /**
     * @return the wordLength
     */
    public int getWordLength() {
        return wordLength;
    }

    /**
     * @param wordLength the wordLength to set
     */
    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

//    /**
//     * @return the wordLetters
//     */
//    public Letter[] getWordLetters() {
//        return wordLetters;
//    }

    /**
     * @return the puzzleOrdinal
     */
    public int getPuzzleOrdinal() {
        return puzzleOrdinal;
    }

    /**
     * @param puzzleOrdinal the puzzleOrdinal to set
     */
    public void setPuzzleOrdinal(int puzzleOrdinal) {
        this.puzzleOrdinal = puzzleOrdinal;
    }
}
