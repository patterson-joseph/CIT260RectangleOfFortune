/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Joseph/Dustin
 */
public class Puzzle {
   String puzzleText = "Hello World!";
    
    public int countLetters(char letter){
        int count = 0;
        
        if(!Character.isLetter(letter) || this.puzzleText.trim().isEmpty()){
            System.out.print("Invalid letter or puzzle given!");
            return -1;
        }
        
        for (int i=0; i < this.puzzleText.length(); i++) {
            if (this.puzzleText.charAt(i) == letter) {
                count++;
                System.out.print("Letter " + letter + " found at position:\t" + i + "\n");
            } else {
                System.out.print("Letter " + letter + " not found at position:\t" + i + "\n");
            }
        }
        
        return (byte) count;
    }
}
