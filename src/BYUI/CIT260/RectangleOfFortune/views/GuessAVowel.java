package BYUI.CIT260.RectangleOfFortune.views;
import BYUI.CIT260.RectangleOfFortune.menu.controls.RectangleOfFortune;
import BYUI.CIT260.RectangleOfFortune.Interfaces.GuessALetter;
import BYUI.CIT260.RectangleOfFortune.exceptions.MenuException;
import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class GuessAVowel implements GuessALetter {
    private static char[] validOptions = {'A','E','I','O','U'};
    
    // display the Guess A Letter menu and get the end users input selection
    @Override
    public char getInput() {
        Boolean notValid = true;
        char command = 0;
        Scanner inFile = RectangleOfFortune.getInputFile();
        
        try{
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
                        throw new MenuException("Please enter a valid command!");
                    }
            } while (notValid);
        } catch(MenuException e){
            Messages.displayError(e.getMessage());
        }
        //read the current Scanner line to clear it out of the buffer
        //so it's ready for the next read
        inFile.nextLine();
        return command;
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