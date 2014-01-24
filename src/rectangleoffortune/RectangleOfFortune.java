/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangleoffortune;

/**
 *
 * @author Joseph
 */
public class RectangleOfFortune {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dustinCrossley = "Dustin Crossley";
        String josephPatterson = "Joseph Patterson";
        
        RectangleOfFortune name = new RectangleOfFortune();
        name.displayDustin(dustinCrossley);
        name.displayJoseph(josephPatterson);
        
        Player player = new Player();
        player.displayName(dustinCrossley);
    }
    
    void displayDustin(String name){
        System.out.print(name);
    }
    
    void displayJoseph(String name){
        System.out.print(name);
    }
    
}