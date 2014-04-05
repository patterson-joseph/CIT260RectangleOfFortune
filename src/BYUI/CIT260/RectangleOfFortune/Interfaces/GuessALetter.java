package BYUI.CIT260.RectangleOfFortune.Interfaces;

/**
 *
 * @author Joseph/Dustin
 */
public interface GuessALetter {
    boolean getInput(char guess);
    void display(char[] validOptions);
}