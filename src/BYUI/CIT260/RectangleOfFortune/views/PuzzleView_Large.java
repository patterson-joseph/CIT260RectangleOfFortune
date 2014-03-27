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
public class PuzzleView_Large extends PuzzleView {
    private final int rowCount;
     Letter[] puzzleArray;
    
    public PuzzleView_Large(Puzzle puzzle) {
        super(puzzle);
        rowCount=puzzle.getWordCount();
        puzzleArray=this.getCurrentPuzzle().getCurrentPuzzle();
    }


    
    private enum puzzlePiece {
       TOPROW("_____ ")
       ,SPACEROW("     |")
       ,BOTTOMROW("_____|")
       ,STARTLEFTTOP(" ")
       ,STARTLEFT("|");
    
        private final String pieceText;

        private puzzlePiece(String pieceText){
            this.pieceText = pieceText;
        }

        /**
         * @return the helpText
         */
        public String getText() {
            return pieceText;
        }
    }
    
    @Override
    public String puzzleTextToDisplay() {
        String section = "";

        // displays something like this:
        //  _____ = top row, section 1
        // |     |  = section 2
        // |  A  |  = section 3, letter
        // |_____|  = section 4
       
        int wordStart;
        int wordEnd=-1;
        
        // loop through each word
        for(int i=1; i<=rowCount;i++) {
            
            wordStart=wordEnd+2; //space plus one
            wordEnd=this.getCurrentPuzzle().getWordEndPosition(wordStart);
            
            //section 1
            section += puzzlePiece.STARTLEFTTOP.getText(); //starting character
            section += this.constructWordRowSection(wordStart, puzzlePiece.TOPROW.getText(), false);

            //section 2
            section += puzzlePiece.STARTLEFT.getText();
            section += this.constructWordRowSection(wordStart,puzzlePiece.SPACEROW.getText(),false);
        
            //section 3
            section += puzzlePiece.STARTLEFT.getText();            
            section += this.constructWordRowSection(wordStart,"",true);
                    
            //section 4
            section += puzzlePiece.STARTLEFT.getText();
            section += this.constructWordRowSection(wordStart,puzzlePiece.BOTTOMROW.getText(),false);
        }
        return section;
    }

    private String constructWordRowSection(int wordStart
            , String sectionText
            , boolean showLetter) {
        
        String wordRow="";

        for (int j=wordStart-1;j<=puzzleArray.length-1;j++) {
             if (puzzleArray[j].getValue()==' ') {
                 break;
             }
             if (showLetter) {
                 wordRow += "  " + (showLetterToOutsideWorld(puzzleArray[j])) + "  |";
             }
             else  {
                wordRow += sectionText;                      
             }
         }
        wordRow += "\n";
        return wordRow;
    }
    

}
