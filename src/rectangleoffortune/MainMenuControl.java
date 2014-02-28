package rectangleoffortune;

/**
 * @author jacksonrkj
 */
public class MainMenuControl  {
    
    public void display1PlayerGame() {
        Game game = new Game(1);
        GameMenuView gameMenu=new GameMenuView(game);
        game.player1.playerName=gameMenu.getPlayerName(1);
        gameMenu.getInput();
    }
    
    public void display2PlayerGame() {
        Game game = new Game(2);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.playerName = gameMenu.getPlayerName(1);
        game.player2.playerName = gameMenu.getPlayerName(2);
        gameMenu.getInput();
    }    

    public void display3PlayerGame() {
        Game game = new Game(3);
        GameMenuView gameMenu = new GameMenuView(game);
        game.player1.playerName = gameMenu.getPlayerName(1);
        game.player2.playerName = gameMenu.getPlayerName(2);
        game.player3.playerName = gameMenu.getPlayerName(3);
        gameMenu.getInput();   
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }    
}
