package rectangleoffortune;

/**
 * @author Joseph/Dustin
 */
public class GuessAConsonant extends GuessALetter {
    private static final char[] validOptions = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    
    public GuessAConsonant(){
        super(GuessAConsonant.validOptions);
    }
}