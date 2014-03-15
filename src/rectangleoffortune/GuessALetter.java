package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GuessALetter {
    //Array of Consonants
    private char[] validOptions = null;
    
    public GuessALetter(char[] validOptions){
        this.setValidOptions(validOptions);
    }

    // display the Guess A Letter menu and get the end users input selection
    public char getInput() {
        Boolean notValid = true;
        char command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        do {
            GuessALetter.display(this.getValidOptions()); // display the menu
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
    public static void display(char[] validOptions) {
        String message = "\tGuess a Letter(";
        for (char letter : validOptions) {
            message += letter;
        }
        message += ")\n";
        Messages.displayMessage(message);
    }

    /**
     * @return the validOptions
     */
    public char[] getValidOptions() {
        return this.validOptions;
    }

    /**
     * @param aValidOptions the validOptions to set
     */
    public void setValidOptions(char[] aValidOptions) {
        validOptions = aValidOptions;
    }
    
}