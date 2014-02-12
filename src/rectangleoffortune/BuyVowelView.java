package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class BuyVowelView {
    //Array of Vowels
    private final static String[] vowels = {"A","E","I","O","U"};
    
    // display the Buy A Vowel menu and get the end users input selection
    public String getInput() {       
        Boolean notVowel = true;
        String command = null;
        Scanner inFile = new Scanner(System.in);
        
        while(notVowel){
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            if(command.length() > 1){
                new RectangleOfFortuneError().displayError("Please enter one character!");
                continue;
            }
            
            for (String vowel : vowels){
                if(vowel == null ? command == null : vowel.equals(command)){
                    notVowel = false;
                }
            }
            
            if(notVowel){
                new RectangleOfFortuneError().displayError("Input is not a vowel. Please enter a vowel.");
            }
        }
        
        return command;
    }
    
    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.print("\tBuy a Vowel(");
        for (String vowel : BuyVowelView.vowels) {
            System.out.print(vowel);
        }
        System.out.print(")\n");
        System.out.println("\t===============================================================\n");
    }
}
