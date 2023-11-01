import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage){
        BallPane ballPane = new BallPane();
        Scene scene = new Scene(ballPane);
        ballPane.setOnKeyPressed(e-> {
            if(e.getCode() == KeyCode.UP){
                ballPane.increaseSpeed();

            }
            else if ( e.getCode() == KeyCode.DOWN){
                ballPane.decreaseSpeed();
            }
        })

        ballPane.setOnMousePressed(e->  {
            {
                ballPane.pause();
            }
        });

        ballPane.setOnMouseReleased(e->{
            {
                ballPane.play();
            }
        })
    }

    public static void main(String[] args) {
        
    }

   
    
}
