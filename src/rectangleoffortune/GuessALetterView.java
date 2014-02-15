package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class GuessALetterView {
    //Array of Consonants
    private final static String[] consonants = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    
    // display the Guess A Letter menu and get the end users input selection
    public String getInput() {
        Boolean notConsonant = true;
        String command = null;
        Scanner inFile = new Scanner(System.in);
        
        while(notConsonant){
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            if(command.length() > 1){
                new RectangleOfFortuneError().displayError("Please enter one character!");
                continue;
            }
            
            for (String consonant : consonants){
                if(consonant == null ? command == null : consonant.equals(command)){
                    notConsonant = false;
                }
            }
            
            if(notConsonant){
                new RectangleOfFortuneError().displayError("Input is not a consonant. Please enter a consonant.");
            }
        }
        
        return command;
    }
    
    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.print("\tBuy a Consonant(");
        for (String consonant : GuessALetterView.consonants) {
            System.out.print(consonant);
        }
        System.out.print(")\n");
        System.out.println("\t===============================================================\n");
    }
}
