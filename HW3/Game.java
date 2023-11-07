import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331FruitNinjaGame;

public class Game extends cs331FruitNinjaGame {

    private MyBlade myBlade; // Create an instance of MyBlade

    public Game() {
        myBlade = new MyBlade("My Blade"); // Initialize your blade with a name
    }

    public void updateChoppable(cs331Fruit fruit) {
        fruit.setImage(Constants.APPLE_PATH);
        fruit.ripen();
        fruit.wash();
        fruit.moveFruit();
        
    }

    @Override
    public cs331Fruit launchItem() {
        MyFruit fruit = new MyFruit();
        return fruit; // Return the generated fruit
    }

   

    // Add any methods or behavior specific to your Game class

    public MyBlade getMyBlade() {
        return myBlade; // Getter for accessing the blade instance
    }



    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
        
    }
}

