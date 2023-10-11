import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

public class Baker {
   public Baker() {
        numberOfPizzasMade = 0;
    }
     
    public CS331Pizza MushroomPizza(){
        
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addMushrooms();
        numberOfPizzasMade++;
        return pizza1;
        
    
    }
    
    public CS331Pizza PineapplePizza(int count){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addPineapple();
      numberOfPizzasMade++;
        return pizza1;
     

    }

    public CS331Pizza PineapplePepperTomatoPizza(){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addPineapple();
        new CS331Toppings().addPeppers(pizza1);
        new CS331Toppings().addTomatoes(pizza1);
        numberOfPizzasMade++;
        return pizza1;
    

    }
    public CS331Pizza SpinachPepperTomatoPizza(){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addSpinach();
        new CS331Toppings().addPeppers(pizza1);
        new CS331Toppings().addTomatoes(pizza1);
        numberOfPizzasMade++;
        return pizza1;
    

    }
    private int numberOfPizzasMade;

    public String getWorkUpdate() {
        return "The baker has made " + numberOfPizzasMade + " pizzas";
    }

    }
    
        
       

