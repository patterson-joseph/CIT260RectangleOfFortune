package rectangleoffortune;

import java.util.Scanner;

/**
 * @author Joseph/Dustin
 */
public class GuessALetterView {
    //Array of Consonants
    public final char[] consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    public final char[] vowels = {'A','E','I','O','U'};
    
    // display the Guess A Letter menu and get the end users input selection
    public char getInput(char[] type) {
        Boolean notValid = true;
        char command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            this.display(type); // display the menu
            
            // get command entered
            command = Character.toUpperCase(inFile.next().charAt(0));

            for (char letter : type){
                if(letter == command){
                    notValid = false;
                    break;
                }
            }
            
            if(notValid){
                new Messages().displayError("Invalid Input!");
            }
        }while(notValid);
        
        return command;
    }
    
    // displays the help menu
    public final void display(char[] type) {
        System.out.println("\n\t===============================================================");
        System.out.print("\tGuess a Letter(");
        for (char letter : type) {
            System.out.print(letter);
        }
        System.out.print(")\n");
        System.out.println("\t===============================================================\n");
    }
}