package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:37 PM
 */
public class ChicagoPizzaStore extends BasePizzaStore {
    @Override
    BasePizza createPizza(String type) {
        BasePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Pizza!!!");
        }

        return pizza;
    }
}
