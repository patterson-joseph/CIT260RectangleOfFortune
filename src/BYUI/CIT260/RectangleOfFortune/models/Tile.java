/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BYUI.CIT260.RectangleOfFortune.models;

/**
 *
 * @author Crossley Family
 */
public class Tile {
    private final String name;
    private final int value;

    Tile(String name, int value) {
        this.name = name;
        this.value = value;        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
   
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }


    
    
    
}
