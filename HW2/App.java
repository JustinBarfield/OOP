import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage stage){

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);
     
        // Add the game here to the frame: Look javadocs for cs331TicTacToeFrame
        
        
        myTicTacToe gameInstance = new myTicTacToe();
        frame.addGame(gameInstance);

    }
    public static void main(String[] args) throws Exception {
        launch(args);
        
    }
}
