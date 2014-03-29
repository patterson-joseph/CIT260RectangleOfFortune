package BYUI.CIT260.RectangleOfFortune.exceptions;

/**
 *
 * @author Joseph/Dustin
 */
public class GuessALetterException extends Exception {
    public GuessALetterException() {
    }

    public GuessALetterException(String message) {
        super(message);
    }

    public GuessALetterException(String message, Throwable cause){
        super(message, cause);
    }

    public GuessALetterException(Throwable cause){
        super(cause);
    }
}