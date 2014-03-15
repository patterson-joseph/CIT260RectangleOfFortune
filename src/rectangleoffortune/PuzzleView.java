/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Dustin/Joseph
 */
public abstract class PuzzleView {
    private final Puzzle currentPuzzle;
    
    PuzzleView(Puzzle puzzle){
        currentPuzzle=puzzle;
    }
    
    protected abstract String puzzleTextToDisplay();
    
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