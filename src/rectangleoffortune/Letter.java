/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Joseph/Dustin
 */
public class Letter {
    Boolean isVisible;
    Boolean isSpace;
    char value;
        
    public Letter(char letter) {
    // default constructor
        isVisible=false;
        isSpace=false;
        value=letter;
        //determine whether a space or not
        if (' '==letter) {
            isSpace=true;
        }
        //else isSpace=false;
    }

}
