import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331FruitNinjaGame;


public class Game extends cs331FruitNinjaGame{

    

    
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

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
        
    }
}
