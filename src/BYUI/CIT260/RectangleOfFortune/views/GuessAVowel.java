package BYUI.CIT260.RectangleOfFortune.views;
import BYUI.CIT260.RectangleOfFortune.Interfaces.GuessALetter;
import BYUI.CIT260.RectangleOfFortune.exceptions.MenuException;

/**
 * @author Joseph/Dustin
 */
public class GuessAVowel implements GuessALetter {
    private static char[] validOptions = {'A','E','I','O','U'};
    
    // display the Guess A Letter menu and get the end users input selection
    @Override
    public boolean getInput(char command) {
        Boolean notValid = true;
        command = Character.toUpperCase(command);
        
        for (char letter : this.getValidOptions()) {
            if (letter == command) {
                notValid = false;
                break;
            }
        }
        
        return notValid;
    }

    // displays the help menu
     @Override
    public void display(char[] validOptions) {
        String message = "\tGuess a Vowel(";
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
        return GuessAVowel.validOptions;
    }

    /**
     * @param aValidOptions the validOptions to set
     */
    public void setValidOptions(char[] aValidOptions) {
        validOptions = aValidOptions;
    }
}