import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
    private double radius =20;
    private double x = radius, y= radius;
    private Circle ball = new Circle(x,y,radius);

    private double dx= 1, dy = 1;

    Timeline animation;




    public BallPane(){
        ball.setFill(Color.BLUE);
        getChildren().add(ball);

        animation = new Timeline(new KeyFrame(Duration.millis(50), e-> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void increaseSpeed(){
        animation.setRate(animation.getRate() + 0.1);

    }
    public void decreaseSpeed(){
        animation.setRate(animation.getRate() - 0.1);
        
    }

    public void pause(){
        animation.pause();
    }
    public void play(){
        animation.play();
    }
    protected void moveBall(){

        if(y < radius || y+radius> getHeight()){|
        dy *= -1;
    }
    if(x < radius || x+radius > getWidth()){|
        dx *= -1;
    }

    

        x+=dx;
        y+=dy;
        ball.setCenterX(x);
        ball.setCenterY(y);

    }
}
