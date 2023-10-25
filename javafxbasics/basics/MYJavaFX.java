package basics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MYJavaFX extends Application {

      @Override
        public void start(Stage myStage) {
            
            Button okBtn = new Button("OK");
            Scene scene = new Scene(okBtn,200,150);
            myStage.setScene(scene);
            myStage.show();
            
            Stage secondaryStage = new Stage();
            Scene myScene = new Scene(new Button("Close"), 200, 300);
            secondaryStage.setScene(myScene);
            secondaryStage.show();


        }

    public static void main(String[] args) {
      Application.launch();
    }

  
}
