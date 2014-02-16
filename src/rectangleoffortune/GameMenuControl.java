package rectangleoffortune;


/**
 *
 * @author Joseph/Dustin
 */
public class GameMenuControl  {
    
    public GameMenuControl() {
        
    } 
        
    public void spin() {
        System.out.println();
        displayBorder();     
        System.out.println(
                "\tThis function will be used to perform the spin operation."
                ); 
        displayBorder();
    }
    
    public void buyAVowel() {
        System.out.println();
        this.displayBorder();             
        System.out.println(
                "\tThis function will be used to perform the buy a vowel operation."
            );
        displayBorder();
    }
          
    public void solveThePuzzle() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "\tThis function will be used to solve the puzzle."
                ); 
        displayBorder();
    }
    
    public void promptForPlayerName(int playerNumber) {
        System.out.println();
        displayBorder();
        System.out.println("Player " + playerNumber + ", please enter your name");
        
    }
    public void displayBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
