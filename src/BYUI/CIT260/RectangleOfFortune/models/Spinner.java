package BYUI.CIT260.RectangleOfFortune.models;

import java.io.Serializable;
import java.util.Random;


/**
 * @author Joseph/Dustin
 */
public class Spinner implements Serializable {
    private int[] spinnerValues;
    private int currentSpinValue;

    Spinner() {
       this.spinnerValues = new int[]{1000, 200, 600, 500, 200, 550, 400, 200
             , 900, 250, 300, 900, 500, 400, 250, 800, 100, 450, 700, 300, 600};
    }
    
    public void spin(){
       currentSpinValue = spinnerValues[new Random().nextInt(spinnerValues.length)];
    }

    /**
     * @return the currentSpinValue
     */
    public int getCurrentSpinValue() {
        return currentSpinValue;
    }

    
}
