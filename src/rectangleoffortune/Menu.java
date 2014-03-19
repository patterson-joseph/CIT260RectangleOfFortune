/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

import BYUI.CIT260.RectangleOfFortune.Interfaces.DisplayInfo;
import BYUI.CIT260.RectangleOfFortune.Interfaces.EnterInfo;
import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Menu implements DisplayInfo, EnterInfo {
    private String[][] menuItems = null;
    
    public Menu(){        
    }
    
    public Menu(String[][] menuItems){
        this();
        this.menuItems = menuItems;
    }
    
//    public abstract String executeCommands();

    // display the help menu and get the end users input selection
    @Override
    public String getCommand() {
        String command;
        Scanner inFile = RectangleOfFortune.getInputFile();
        boolean valid;
        
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            valid = validCommand(command);
            
            if(!valid){
                Messages.displayError("Invalid command. Please enter a valid command.");
            }
        } while (!valid);
        
        return command;
    }

    // displays the help menu
    @Override
    public final void display() {
        String menuText = "\tEnter the letter associated with one of the following commands:";
        for (String[] menuItem : this.menuItems) {
            menuText += "\n\t" + menuItem[0] + "\t" + menuItem[1];
        }
        Messages.displayMessage(menuText.toString());
    }

    public final void display(Player player) {
        String menuText = player.getPlayerName() + ", it's your turn. " + 
            "You currently have $" + player.getPlayerRoundBank() + ".\n\t" +
            "Enter the letter associated with one of the following commands:";
        for (String[] menuItem : this.menuItems) {
            menuText += "\n\t" + menuItem[0] + "\t" + menuItem[1];
        }
        Messages.displayMessage(menuText);        
    }
    
    /**
     * @return the menuItems
     */
    public String[][] getMenuItems() {
        return menuItems;
    }

    /**
     * @param menuItems the menuItems to set
     */
    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }

    private boolean validCommand(String command) {
//        String[][] items = this.menuItems;
        
        for(String[] item : this.menuItems){
            if(item[0].equals(command)){
                return true;
            }
        }
        return false;
    }    
}
