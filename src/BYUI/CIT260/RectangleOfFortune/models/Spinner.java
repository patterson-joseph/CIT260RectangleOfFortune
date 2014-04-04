package BYUI.CIT260.RectangleOfFortune.models;

import java.io.Serializable;
import java.util.List;
import java.util.Random;


/**
 * @author Joseph/Dustin
 */
public class Spinner implements Serializable {
//    private int[] spinnerValues;
//    private int currentSpinValue;
    private final Tile[] spinnerValues;
    private Tile currentSpinValue;
    
    Spinner() { 
        spinnerValues=new Tile[21];
        spinnerValues[0] = new Tile("1000",1000);
        spinnerValues[1] = new Tile("200",200);
        spinnerValues[2] = new Tile("600",600);
        spinnerValues[3] = new Tile("500",500);
        spinnerValues[4] = new Tile("200",200);
        spinnerValues[5] = new Tile("550",550);
        spinnerValues[6] = new Tile("400",400);
        spinnerValues[7] = new Tile("200",200);
        spinnerValues[8] = new Tile("900",900);
        spinnerValues[9] = new Tile("250",250);
        spinnerValues[10] = new Tile("300",300);
        spinnerValues[11] = new Tile("900",900);
        spinnerValues[12] = new Tile("500",500);
        spinnerValues[13] = new Tile("400",400);
        spinnerValues[14] = new Tile("250",250);
        spinnerValues[15] = new Tile("800",800);
        spinnerValues[16] = new Tile("100",100);
        spinnerValues[17] = new Tile("450",450);
        spinnerValues[18] = new Tile("700",700);
        spinnerValues[19] = new Tile("300",300);
        spinnerValues[20] = new Tile("600",600);           
        
    }
   
    public void spin(){
       currentSpinValue = spinnerValues[new Random().nextInt(spinnerValues.length)];
    }

    /**
     * @return the currentSpinValue
     */
    public Tile getCurrentSpinValue() {
        return currentSpinValue;
    }    
    
//    Spinner() {
//       this.spinnerValues = new int[]{1000, 200, 600, 500, 200, 550, 400, 200
//             , 900, 250, 300, 900, 500, 400, 250, 800, 100, 450, 700, 300, 600};
//    }
    
//    public void spin(){
//       currentSpinValue = spinnerValues[new Random().nextInt(spinnerValues.length)];
//    }
//
//    /**
//     * @return the currentSpinValue
//     */
//    public int getCurrentSpinValue() {
//        return currentSpinValue;
//    }

    
}
