/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.Enums;

/**
 *
 * @author Crossley Family
 */
public enum ErrorTypes {
    NOTNUMBER("Invalid Number. Please enter a number."),
    ROUNDCOUNTERROR("Vanna isn't quite up for that number of rounds.");

    private final String mainText;

    private ErrorTypes(String mainText){
        this.mainText = mainText;
    }
    
    /**
     * @return the helpText
     */
    public String getText() {
        return mainText;
    }
}
