package BYUI.CIT260.RectangleOfFortune.Enums;

/**
 *
 * @author Crossley Family
 */
public enum HelpMenuItems {
    
    GAME ("The objective of the game is to be the first player to correctly guess the puzzle word or phrase. Each playertakes turns spinning for a value of correctly guessed consonants, then guesses a single consonant. Guessing an incorrect consonant or a consonant already guessed in the round is the end of the turn. Play resumes with the next player spinning either guessing a consonant, buying remaining vowels, or guessing the puzzle. Players may buy a vowel if they have at least $250 in their bank."),  
    RECTANGLE ("The Rectangle represents the \"Wheel\", as in the Wheel of Fortune. It consists of a rectangular grid of squares, each square having either a dollar amount, a lose a turn square, or two bankruptcy squares. Players press a spin button to find out which square is chosen at the beginning of the round."),
    COMPUTER ("A computer based player automatically takes its turn in sequence after a real player."),
    TURN ("A player is given three choices at the beginning of their turn; spin, buy a vowel, or solve the puzzle. If the player chooses spin the rectangle marker is moved forward and the player is prompted to guess a letter. If the player chooses buy a vowel $250 is deducted from their current bank. If the vowel is found in the puzzle they take another turn. If the player chooses to solve the puzzle they are prompted to enter their guess. If they are correct they are awarded the money for that tround, if they are incorrect they lose their turn."),
    PUZZLE ("A new puzzle is randomly generated at the beginning of each game. A puzzle will be a well known person, place, thing, or phrase."),
    BANK ("Each player has a bank which starts at $0. As the player guesses letters correctly the total is added to his current bank. A player may lose money through the purchase of vowels or by landing on one of the two Bankruptcy squares on the Rectangle.");
    
    private final String helpText;

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
