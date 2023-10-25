package basics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class CircleInPane extends Application {

    public void start( Stage primaryStage){
        Pane pane = new Pane();

        Circle circle = new Circle(100,100,20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane,200,200);

        primaryStage.setScene(scene);
        primaryStage.show();
        

        
        


    } 

    public static void main(String[] args) {
        Application.launch();
      }
  

    
}
