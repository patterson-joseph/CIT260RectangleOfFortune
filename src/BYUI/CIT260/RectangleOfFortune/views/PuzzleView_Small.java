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
 * @author Crossley Family
 */
public class PuzzleView_Small extends PuzzleView {
    
    public PuzzleView_Small(Puzzle puzzle) {
        super(puzzle);
    }
        
    
    @Override
    public String puzzleTextToDisplay() {
        String section = "";
        String startLeft = "|"; //left side bars to start
        String topBottomRow = "---|"; //standard top and bottom of box
        Letter[] puzzleArray=this.getCurrentPuzzle().getCurrentPuzzle();
        // displays something like this:
        // ---|  = top row (section 1)
        //  A |  = middle row (section 2)
        // ---|  = bottom row (section 3)
        
        //Left side bars should always precede the section
        //, resulting in letters that looks like this when put together:
        // |---|---|  = top row (section 1)
        // | A | B |  = middle row (section 2)
        // |---|---|  = bottom row (section 3)    
        
//        for (int i = 1; i < 4; i++) {
            //top row
            section += startLeft; //starting character
            for (Letter x : puzzleArray) {
                section += topBottomRow;
            }
            //clear current line to start fresh on next line
            section += "\n";
            //middle row
            section += startLeft; //starting character            
            for (Letter x : puzzleArray) {
                //this is the letter line, space letter space closing bar
                section += " " + (showLetterToOutsideWorld(x)) + " |";             
            }
            //clear current line to start fresh on next line
            section += "\n";              
            //botton row
            section += startLeft; //starting character
            for (Letter x : puzzleArray) {
                section += topBottomRow;
            }
            //clear current line to start fresh on next line
            section += "\n";
            
        return section;
    }

}
