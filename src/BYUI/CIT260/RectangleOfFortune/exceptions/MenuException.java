package BYUI.CIT260.RectangleOfFortune.exceptions;

/**
 *
 * @author Joseph/Dustin
 */
public class MenuException extends Exception {
    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause){
        super(message, cause);
    }

    public MenuException(Throwable cause){
        super(cause);
    }
}