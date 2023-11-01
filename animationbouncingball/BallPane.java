import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class BallPane extends Pane {
    private double radius =20;
    private double x = radius, y= radius;
    private Circle ball = new Circle(x,y,radius);

    private double dx= 1, dy = 1;

    Timeline animation;




    public BallPane(){
        ball.setFill(Color.BLUE);
        getChildren().add(ball);

        animation = new Timeline(new KeyFrame(Duration.millis(50), e-> MoveBall()));
    }

    protected void moveBall(){
        x+=dx;
        y+=dy;
        ball.setCenterX(x);
        ball.seCenterY(y);

    }
}
