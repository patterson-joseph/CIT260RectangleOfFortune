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
public enum GameMenuItems {
    
    LOWBALANCE("Not enough money to buy a vowel!"),
    WRONGGUESS("Sorry that is incorrect!"),
    VIEWCHANGED("Puzzle view changed"),
    NAMEPROMPT("Please enter your name"),
    EXITMESSAGE("Thanks for playing!"),
    ROUNDPROMPT("How many rounds do you want to play?"),
    ROUNDLIMIT("Please enter a number between 1 and 5");

    private final String mainText;

    private GameMenuItems(String mainText){
        this.mainText = mainText;
    }
    
    /**
     * @return the helpText
     */
    public String getText() {
        return mainText;
    }
    
}
