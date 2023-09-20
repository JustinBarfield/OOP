import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

public class Baker {
    private int count =0;
    public CS331Pizza MushroomPizza(){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addMushrooms();
        return pizza1;
    
    }
    
    public CS331Pizza PineapplePizza(){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addPineapple();
        return pizza1;
    

    }

    public CS331Pizza PineapplePepperTomatoPizza(){
        pizzaHelper.CS331Pizza pizza1 = new pizzaHelper.CS331Pizza();
        pizza1.addPineapple();
        new CS331Toppings().addPeppers(pizza1);
        new CS331Toppings().addTomatoes(pizza1);
        return pizza1;
    

    }
    
        
       
}
