/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.Enums;

/**
 *
 * @author Crossley Family
 */
public enum HelpMenuItems {
    
    GAME (     "The objective of the game is to be the first player to "
                + "\n\tcorrectly guess the puzzle word or phrase. Each player "
                + "\n\ttakes turns spinning for a value of correctly guessed "
                + "\n\tconsonants, then guesses a single consonant. Guessing "
                + "\n\tan incorrect consonant or a consonant already guessed "
                + "\n\tin the round is the end of the turn. Play resumes with "
                + "\n\tthe next player spinning either guessing a consonant, "
                + "\n\tbuying remaining vowels, or guessing the puzzle."
                + "\n\tPlayers may buy a vowel if they have at least $250 in "
                + "\n\ttheir bank."
                ),
    
    
    RECTANGLE (
                "The Rectangle represents the \"Wheel\", as in the Wheel of Fortune. "
                + "\n\t It consists of a rectangular grid of squares, each square having "
                + "\n\t either a dollar amount, a lose a turn square, or two bankruptcy "
                + "\n\t squares. Players press a spin button to find out which square is "
                + "\n\t chosen at the beginning of the round."
            ),
    
            
    COMPUTER (
                "A computer based player automatically takes its turn in sequence "
                + "\n\t after a real player."
                ),
    
    
                   
    TURN (
                "A player is given three choices at the beginning of their turn;\n"
                + "\tspin, buy a vowel, or solve the puzzle. If the player chooses\n"
                + "\tspin the rectangle marker is moved forward and the player\n"
                + "\tis prompted to guess a letter. If the player chooses buy a\n"
                + "\tvowel $250 is deducted from their current bank. If the vowel\n"
                + "\tis found in the puzzle they take another turn. If the player\n"
                + "\tchooses to solve the puzzle they are prompted to enter their\n"
                + "\tguess. If they are correct they are awarded the money for that\n"
                + "\tround, if they are incorrect they lose their turn."
                ), 
    
             
   PUZZLE (
                "A new puzzle is randomly generated at the beginning of each\n"
                + "\tgame. A puzzle will be a well known person, place, thing, or phrase."
                ),
    
                 
    BANK (
                "Each player has a bank which starts at $0. As the player\n"
                + "\tguesses letters correctly the total is added to his current\n"
                + "\tbank. A player may lose money through the purchase of vowels\n"
                + "\tor by landing on one of the two Bankruptcy squares on the Rectangle."
        );
    
    private String helpText;

    private HelpMenuItems(String helpText){
        this.helpText = helpText;
    }
    
    /**
     * @return the helpText
     */
    public String getHelpText() {
        return helpText;
    }

}
