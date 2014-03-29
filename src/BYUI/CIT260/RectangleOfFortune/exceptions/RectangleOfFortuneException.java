/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.exceptions;

/**
 *
 * @author Crossley Family
 */
public class RectangleOfFortuneException extends Exception {
    
    public RectangleOfFortuneException() {
    }

    public RectangleOfFortuneException(String message) {
        super(message);
    }

    public RectangleOfFortuneException(String message, Throwable cause){
        super(message, cause);
    }

    public RectangleOfFortuneException(Throwable cause){
        super(cause);
    }    
}
