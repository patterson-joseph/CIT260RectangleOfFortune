package rectangleoffortune;

/**
 *
 * @author Joseph/Dustin
 */
public class Player {
    private String playerName; // = "Default User";
    int playerRoundBank; // total won for the round
    int playerGameBank; //total won during the game
    int wins; // = 2;
    int losses; // = 1;
    
Player(int playerNumber) {
    wins=0;
    losses=0;
    this.playerName="Player" + playerNumber;
}
   
    public void getPlayerName(){
        System.out.println("Player name is: " + playerName + ".");
    }
    
    public void displayBank(){
        System.out.println("Player has $" + playerRoundBank + " in the bank.");
    }
    
    public void displayWins(){
        System.out.println("Player has won " + wins + " games.");
    }
    
    public void displayLosses(){
        System.out.println("Player has lost " + losses + " games.");
    }
    
   public boolean updatePlayerBank(int letterValue
            , int numberOfCorrectLetters) {
       
       if (letterValue < 0) {
           System.out.println("Invalid letter value: \n"
                   + "\t" + letterValue);
           return false;
       }
       if (numberOfCorrectLetters < 0) {
           System.out.println("Invalid number of letters: \n"
                    + "\t" + numberOfCorrectLetters);
           return false;
       }
       if (playerRoundBank < 0) {
           System.out.println("Invalid player bank amount: \n"
                   + "\t" + playerRoundBank);
           return false;
       }
       
       playerRoundBank += letterValue*numberOfCorrectLetters;
       return true;
    }
}
