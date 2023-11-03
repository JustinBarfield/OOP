import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BrickBreaker brickBreaker = new BrickBreaker();
        Pane root = new Pane(brickBreaker);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

