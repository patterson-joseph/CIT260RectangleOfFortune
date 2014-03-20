/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Crossley Family
 */
public class PuzzleView_Large extends PuzzleView {
    private final int rowCount;
    
    public PuzzleView_Large(Puzzle puzzle) {
        super(puzzle);
        rowCount=puzzle.getWordCount();
    }
        
    
    @Override
    public String puzzleTextToDisplay() {
        String section = "";
        String startLeft = "|"; //left side bars to start
        String topRow = "_____ "; //standard top of box
        String bottomRow = "_____|"; //standard bottom of box
        Letter[] puzzleArray=this.getCurrentPuzzle().getCurrentPuzzle();
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
            section += " "; //starting character
            section += this.constructWordRowSection(puzzleArray,wordStart,topRow,false);

            //section 2
            section += startLeft;
            section += this.constructWordRowSection(puzzleArray,wordStart,"     |",false);
        
            //section 3
            section += startLeft;            
            section += this.constructWordRowSection(puzzleArray,wordStart,"",true);
                    
            //section 4
            section += startLeft;
            section += this.constructWordRowSection(puzzleArray,wordStart,bottomRow,false);

        }
        return section;
    }

    private String constructWordRowSection(Letter[] puzzleArray
            , int wordStart
            , String sectionText
            , boolean showLetter) {
        
        String wordRow="";

        for (int j=wordStart-1;j<=puzzleArray.length-1;j++) {
             if (puzzleArray[j].getValue()==' ') {
//                 wordRow += "\n";
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
