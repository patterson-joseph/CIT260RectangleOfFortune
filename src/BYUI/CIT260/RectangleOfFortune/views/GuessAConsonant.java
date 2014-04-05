package BYUI.CIT260.RectangleOfFortune.views;
import BYUI.CIT260.RectangleOfFortune.Interfaces.GuessALetter;

/**
 * @author Joseph/Dustin
 */
public class GuessAConsonant implements GuessALetter {
    private static char[] validOptions = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    // display the Guess A Letter menu and get the end users input selection
    @Override
    public boolean getInput(char command) {
        Boolean notValid = true;
        
        for (char letter : this.getValidOptions()) {
            if (letter == command) {
                notValid = false;
                break;
            }
        }
        
        return !notValid;
    }

    // displays the help menu
     @Override
    public void display(char[] validOptions) {
        String message = "\tGuess a Consonant(";
        for (char letter : validOptions) {
            message += letter;
        }
        message += ")";
        Messages.displayMessage(message.toString());
    }

    /**
     * @return the validOptions
     */
    public char[] getValidOptions() {
        return GuessAConsonant.validOptions;
    }

    /**
     * @param aValidOptions the validOptions to set
     */
    public void setValidOptions(char[] aValidOptions) {
        validOptions = aValidOptions;
    }
}