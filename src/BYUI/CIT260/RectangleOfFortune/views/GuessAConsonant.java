package BYUI.CIT260.RectangleOfFortune.views;
import BYUI.CIT260.RectangleOfFortune.menu.controls.RectangleOfFortune;
import BYUI.CIT260.RectangleOfFortune.views.Messages;
import BYUI.CIT260.RectangleOfFortune.Interfaces.GuessALetter;
import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class GuessAConsonant implements GuessALetter {
    private static char[] validOptions = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    // display the Guess A Letter menu and get the end users input selection
    @Override
    public char getInput() {
        Boolean notValid = true;
        char command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        do {
            this.display(this.getValidOptions()); // display the menu
            // get command entered
            command = Character.toUpperCase(inFile.next().charAt(0));
            for (char letter : this.getValidOptions()) {
                if (letter == command) {
                    notValid = false;
                    break;
                }
            }
            if (notValid) {
                Messages.displayError("Invalid Input!");
            }
        } while (notValid);
        //read the current Scanner line to clear it out of the buffer
        //so it's ready for the next read
        inFile.nextLine();
        return command;
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