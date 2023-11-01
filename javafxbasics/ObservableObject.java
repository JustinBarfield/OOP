import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservableObject {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();

        balance.addListener(ov -> System.out.println("the new value is " + balance.getValue()));

        balance.set(5.6);

    }
    
}
