/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Dustin
 */
public class CurrentRound {
    int currentPlayerTurn=1;
    int remainingVowels=3;

    public void showCurrentPlayerTurn() {
        System.out.println("It is player " + currentPlayerTurn + "'s turn.");
    }
    public void showRemainingVowels() {
        System.out.println("There are " + remainingVowels 
                + " vowels remaining.");
    }
}
