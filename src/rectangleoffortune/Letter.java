package rectangleoffortune;

/**
 * @author Joseph/Dustin
 */
public class Letter {
    Boolean isVisible;
    Boolean isSpace;
    char value;
        
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
        if (this.isSpace) {
            string=" ";
        }
        else if (this.isVisible) {
            string=Character.toString(value);
        }
        else {
            string="?";
        }
        return string;
    }
}