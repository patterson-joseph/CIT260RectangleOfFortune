/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import BYUI.CIT260.RectangleOfFortune.Interfaces.PuzzleInfo;

/**
 *
 * @author Dustin/Joseph
 */
public abstract class PuzzleView implements PuzzleInfo{
    private final Puzzle currentPuzzle;
    
    PuzzleView(Puzzle puzzle){
        currentPuzzle=puzzle;
    }
    
    
    public abstract String puzzleTextToDisplay();
    
    @Override
    public void displayPuzzle() {
        System.out.print(puzzleTextToDisplay());
    }

    /**
     * @return the currentPuzzle
     */
    public Puzzle getCurrentPuzzle() {
        return currentPuzzle;
    }
    
    protected String showLetterToOutsideWorld(Letter letter) {
        String str;
        if (letter.getIsSpace()) {
            str=" ";
        }
        else if (letter.getIsVisible()) {
            str=Character.toString(letter.getValue());
        }
        else {
            str="?";
        }
        return str;
    }    
}