package rectangleoffortune;

import java.util.Scanner;

/**
 *
 * @author Joseph/Dustin
 */
public class RectangleOfFortune {
    String playerName;
    String instructions = "This is the game of Rectangle of Fortune. \n\n"
            + "You will be playing against 1 or 2 other players. \n"
            + "The object of the game is to solve the puzzle before \n"
            + "the other players.  Guessing a correct letter allows you \n"
            + "guess another letter or guess the puzzle. Press the spin \n"
            + "button to start your turn.  Player 1 goes first.\n\n";

    public static void main(String[] args) {
        
        RectangleOfFortune myGame = new RectangleOfFortune();
        myGame.displayIntro();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
    
    void displayDustin(String name){
        System.out.print(name);
    }
    
    void displayJoseph(String name){
        System.out.print(name);
    }
    
    void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter your name: ");
        this.playerName = input.next();
    }
    
    public void displayIntro() {
        System.out.println("\nWelcome!"); // + this.playerName + 
        new Messages().displayMessage(this.instructions);
    }
}
