/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.views;

import BYUI.CIT260.RectangleOfFortune.models.Letter;
import BYUI.CIT260.RectangleOfFortune.models.Puzzle;

/**
 *
 * @author Joseph/Dustin
 */
public class PuzzleView_Frame extends PuzzleView {
    
    public PuzzleView_Frame(Puzzle puzzle) {
        super(puzzle);
    }
           
    @Override
    public String puzzleTextToDisplay() {
        String section;
        section = super.getCurrentPuzzle().getPuzzleText();
        return section;
    }

    public Letter[] puzzleLettersToDisplay() {
        return super.getCurrentPuzzle().getCurrentPuzzle();
    }
}
