package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class RectangleOfFortune {
    static String instructions = "This is the game of Rectangle of Fortune. \n\n"
            + "You will be playing against 1 or 2 other players. \n"
            + "The object of the game is to solve the puzzle before \n"
            + "the other players.  Guessing a correct letter allows you \n"
            + "guess another letter or guess the puzzle. Press the spin \n"
            + "button to start your turn.  Player 1 goes first.\n\n";
    
    private static Scanner inFile = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //display our splash page
        displayIntro();
        //call the main menu up
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands();
    }
    
    public static void displayIntro() {
        System.out.println("\nWelcome!"); // + this.playerName + 
        Messages.displayMessage(instructions);
    }

    /**
     * @return the inFile
     */
    public static Scanner getInputFile() {
        //available for all classes to use rather than keep instancing a new input each time
        //a Singleton pattern
        return RectangleOfFortune.inFile;
    }
}
