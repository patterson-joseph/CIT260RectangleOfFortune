/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.models;

import java.io.Serializable;

/**
 * @author Joseph/Dustin
 */
public class Letter implements Serializable{
    private Boolean isVisible;
    private Boolean isSpace;
    private final char value;
        
    public Letter(char letter) {
    // default constructor
        isVisible=false;
        isSpace=false;
        value=letter;
        //determine whether a space or not
        if (' '==letter) {
            isSpace=true;
        }
    }

    /**
     * @return the isVisible
     */
    public Boolean getIsVisible() {
        return isVisible;
    }

    /**
     * @param isVisible the isVisible to set
     */
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * @return the isSpace
     */
    public Boolean getIsSpace() {
        return isSpace;
    }

    /**
     * @param isSpace the isSpace to set
     */
    public void setIsSpace(Boolean isSpace) {
        this.isSpace = isSpace;
    }

    /**
     * @return the value
     */
    public char getValue() {
        return value;
    }

}
