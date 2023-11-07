import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaGame;

import java.util.ArrayList;
import java.util.List; // Import the necessary List class

public class MyBlade extends cs331FruitNinjaGame {
    private cs331Blade myBlade;
    private List<Object> choppableObjects; // Declare and define choppableObjects

    public MyBlade(String name) {
        super();
        myBlade = new cs331Blade(name);
        addBlade(myBlade);
        choppableObjects = new ArrayList<>(); // Initialize choppableObjects as a list
    }

    @Override
    public Object launchItem() {
        // Implement the logic to generate choppable items (fruits or bombs) offscreen
        // For example, create instances of MyFruit or MyBomb and return them
        return null; // Return the generated choppable item
    }

    @Override
public void updateChoppableHelper() {
    for (Object choppableObject : choppableObjects) {
        if (myBlade.checkIntersection(choppableObject)) {
            if (choppableObject instanceof MyFruit) {
                // Implement behavior when a fruit is chopped
                MyFruit fruit = (MyFruit) choppableObject;
                increaseScore(10); // Increase the score by 10 points
                removeFruit(fruit); // Remove the fruit from the game
                playChoppingAnimation(fruit); // Play a chopping animation
            } else if (choppableObject instanceof MyBomb) {
                // Implement behavior when a bomb is chopped
                MyBomb bomb = (MyBomb) choppableObject;
                
                removeBomb(bomb); // Remove the bomb from the game
                triggerExplosionAnimation(bomb); // Trigger an explosion animation
            }
        }
    }
}

private int score = 0; // Initialize the score variable

private List<MyFruit> activeFruits = new ArrayList<>(); // Maintain a list of active fruits
private List<MyBomb> activeBombs = new ArrayList<>(); // Maintain a list of active bombs

private void increaseScore(int points) {
    score += points; // Increase the score by the specified points
    System.out.println("Score: " + score); // Print the updated score (you can update it on the screen)
}



private void removeFruit(MyFruit fruit) {
    if (activeFruits.contains(fruit)) {
        activeFruits.remove(fruit); // Remove the chopped fruit from the list of active fruits
    }
    // You may need to update the game's graphical display to reflect the removal of the fruit.
}

private void removeBomb(MyBomb bomb) {
    if (activeBombs.contains(bomb)) {
        activeBombs.remove(bomb); // Remove the chopped bomb from the list of active bombs
    }
    // You may need to update the game's graphical display to reflect the removal of the bomb.
}

private void playChoppingAnimation(MyFruit fruit) {
    // Implement the animation logic when a fruit is chopped
    // For example, you can display a chopping animation at the fruit's position.
    // You might use JavaFX or a similar library for animations.
    System.out.println("Chopped a fruit!");
    // Add animation logic here
}

private void triggerExplosionAnimation(MyBomb bomb) {
    // Implement the animation logic when a bomb is chopped
    // For example, you can trigger an explosion animation at the bomb's position.
    // You might use JavaFX or a similar library for animations.
    System.out.println("Chopped a bomb!");
    // Add explosion animation logic here
}


    
}

