package rectangleoffortune;

import java.io.Serializable;

/**
 * @author Joseph/Dustin
 */
public class Letter implements Serializable{
    private Boolean isVisible;
    private Boolean isSpace;
    private char value;
        
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

    public String displayLetterSection(int section) {
        // displays something like this:
        // ---|  = top row (section 1)
        //  A |  = middle row (section 2)
        // ---|  = bottom row (section 3)
        
        //Left side bars should already by taken care of
        //, resulting in letters that looks like this when put together:
        // |---|---|  = top row (section 1)
        // | A | B |  = middle row (section 2)
        // |---|---|  = bottom row (section 3)        

        String sectionDetail="";    
        switch (section) {
            case 1:
                sectionDetail = "---|";
                break;
            case 2:
                sectionDetail = " " + this.showToOutsideWorld() + " |";
                break;
            case 3:
                sectionDetail = "---|";
                break;
        }
        return sectionDetail;
    }

    private String showToOutsideWorld() {
        String string="";
        if (this.getIsSpace()) {
            string=" ";
        }
        else if (this.getIsVisible()) {
            string=Character.toString(getValue());
        }
        else {
            string="?";
        }
        return string;
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

    /**
     * @param value the value to set
     */
    public void setValue(char value) {
        this.value = value;
    }
}