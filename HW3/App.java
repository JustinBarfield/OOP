import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);
        Game game = new Game();
        cs331ScoreController score = new cs331ScoreController();
        
        frame.addGame(game);
        frame.setTop(score);
        primaryStage.show();
        game.startGame();
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
