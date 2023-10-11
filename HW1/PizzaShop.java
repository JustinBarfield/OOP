import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;
    private Baker baker;
    
    
    

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */

    public PizzaShop() {
        super();
        
        displayShopUpdate("shop is open");
       
        

        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();
        this.baker = new Baker();
        
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() {
       // System.out.println("5.2 test order1");
       pizzaHelper.CS331Pizza pizza1 = new Baker().MushroomPizza();
       this.displayPrice(pizza1);
       String workUpdate = baker.getWorkUpdate();
       System.out.println(workUpdate);

       

       
        
        
        
        
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() {
        pizzaHelper.CS331Pizza pizza1 = new Baker().PineapplePizza(1);
        new CS331Toppings().addPeppers(pizza1);
       this.displayPrice(pizza1);
       String workUpdate = baker.getWorkUpdate();
       System.out.println(workUpdate);
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3(){
        pizzaHelper.CS331Pizza pizza1 = new Baker().PineapplePepperTomatoPizza();
       this.displayPrice(pizza1);
       String workUpdate = baker.getWorkUpdate();
       System.out.println(workUpdate);
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() {
        pizzaHelper.CS331Pizza pizza1 = new Baker().SpinachPepperTomatoPizza();
       this.displayPrice(pizza1);
       String workUpdate = baker.getWorkUpdate();
       System.out.println(workUpdate);
    }
}
