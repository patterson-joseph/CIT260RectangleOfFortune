package rectangleoffortune;

/**
 * @author Joseph/Dustin
 */
public class GuessAVowel extends GuessALetter {
    private final static char[] validOptions = {'A','E','I','O','U'};
    
    public GuessAVowel(){
        super(GuessAVowel.validOptions);
    }
}