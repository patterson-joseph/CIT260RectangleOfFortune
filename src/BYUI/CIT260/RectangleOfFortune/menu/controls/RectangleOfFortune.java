package BYUI.CIT260.RectangleOfFortune.menu.controls;

import BYUI.CIT260.RectangleOfFortune.frames.MainFrame;
import BYUI.CIT260.RectangleOfFortune.views.Messages;
//import BYUI.CIT260.RectangleOfFortune.views.MainMenuView;
import java.util.Arrays;
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
    
    private final static Scanner inFile = new Scanner(System.in);
    public MainFrame mainFrame = null;
    public static void main(String[] args) {
        
//        //display our splash page
//        displayIntro();
//        //call the main menu up
//        MainMenuView mainMenu = new MainMenuView();
        
        
        
//        try {
//            mainMenu.executeCommands();
//        } catch (Throwable e) {
//            Messages.displayError("Unexpected Error: " + e.getMessage());
//            Messages.displayError(Arrays.toString(e.getStackTrace()));
//        } finally {
//            RectangleOfFortune.inFile.close();
//        }
        
//        RectangleOfFortune rectangleOfFortune = null;
        final RectangleOfFortune rectangleOfFortune=new RectangleOfFortune();
        
        try {
            /* Create and display jframe form */
            java.awt.EventQueue.invokeLater(new Runnable() {
               @Override
               public void run() {
                   rectangleOfFortune.mainFrame = new MainFrame();
                   
                   rectangleOfFortune.mainFrame.setVisible(true);
               }
            });
        } catch (Throwable ex){
            Messages.displayError("Unexpected Error: " + ex.getMessage());
            Messages.displayError(Arrays.toString(ex.getStackTrace()));
        } finally {
            if (rectangleOfFortune.mainFrame != null) {
                rectangleOfFortune.mainFrame.dispose();
            }
        }
        
    }
    
    public static void displayIntro() {
        Messages.displayLine("Welcome!"); // + this.playerName + 
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
