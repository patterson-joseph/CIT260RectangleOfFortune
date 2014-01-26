/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Dustin
 */
public class Board {
    String puzzleText = "Hello World";
    int puzzleLength = puzzleText.length();

    public void getPuzzleLength() {
        System.out.println("Puzzle is: " + this.puzzleLength 
                + " characters long");
    }
    
    public void getPuzzleText() {
        System.out.println("Puzzle text is: '" + this.puzzleText + "'");
    }
    
}
