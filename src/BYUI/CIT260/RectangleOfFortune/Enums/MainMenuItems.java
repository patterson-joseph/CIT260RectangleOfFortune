package BYUI.CIT260.RectangleOfFortune.Enums;

/**
 *
 * @author Joseph
 */
public enum MainMenuItems {
    ONEPLAYER("1 Player Practice Game"),
    TWOPLAYER("2 Player Game"),
    THREEPLAYER("3 Player Game"),
    HELPMENU("Help Menu"),
    EXITGAME("Exit Rectangle of Fortune");

    private final String mainText;

    private MainMenuItems(String mainText){
        this.mainText = mainText;
    }
    
    /**
     * @return the helpText
     */
    public String getMainText() {
        return mainText;
    }
}
