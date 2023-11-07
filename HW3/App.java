import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) {
        // Create the game frame
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);
        frame.setTop(new cs331ScoreController());

        // Create and add the game to the frame
        Game game = new Game();
        frame.addGame(game);

        // Show the stage
        primaryStage.show();

        // Start the game
        game.startGame();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

