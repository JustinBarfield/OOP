import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage){

        CirclePane  circlePane = new CirclePane();
        circlePane.getChildren().add(new Circle(50));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("control center");
        primaryStage.show();

        Button btn1 = new Button("enlarge");
        Button btn2 = new Button("shrink");
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(btn1,btn2);
        borderPane.setBottom(hbox);
        


        

        


    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}