package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:36 PM
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        BasePizzaStore nyStore = new NewYorkPizzaStore();
        BasePizzaStore chicagoStore = new ChicagoPizzaStore();

        BasePizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
