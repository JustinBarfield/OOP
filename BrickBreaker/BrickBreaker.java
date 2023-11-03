
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
public class BrickBreaker extends Pane {
    private double radius =20;
    private double x = radius, y= radius;
    private Circle ball = new Circle(x,y,radius);
    private Rectangle paddle = new Rectangle(10, 10);

    



    public BrickBreaker(){
        ball.setFill(Color.BLUE);
        paddle.setFill(Color.BLACK);
        getChildren().addAll(ball,paddle);


    }

}