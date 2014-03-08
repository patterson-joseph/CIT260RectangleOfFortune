package rectangleoffortune;

import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class GuessALetterView {
    //Array of Consonants
    private static final char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] vowels = {'A','E','I','O','U'};
    
    // display the Guess A Letter menu and get the end users input selection
    public static char getInput(char[] type) {
        Boolean notValid = true;
        char command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        
        do{
            GuessALetterView.display(type); // display the menu
            
            // get command entered
            command = Character.toUpperCase(inFile.next().charAt(0));

            for (char letter : type){
                if(letter == command){
                    notValid = false;
                    break;
                }
            }
            
            if(notValid){
                Messages.displayError("Invalid Input!");
            }
        }while(notValid);
        //read the current Scanner line to clear it out of the buffer
        //so it's ready for the next read
        inFile.nextLine();
        
        return command;
    }
    
    // displays the help menu
    public static final void display(char[] type) {
        System.out.println("\n\t===============================================================");
        System.out.print("\tGuess a Letter(");
        for (char letter : type) {
            System.out.print(letter);
        }
        System.out.print(")\n");
        System.out.println("\t===============================================================");
    }

    /**
     * @return the consonants
     */
    public static char[] getConsonants() {
        return consonants;
    }

    /**
     * @return the vowels
     */
    public static char[] getVowels() {
        return vowels;
    }
}