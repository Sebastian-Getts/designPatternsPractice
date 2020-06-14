package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:34 PM
 */
public class NewYorkPizzaStore extends BasePizzaStore {
    @Override
    BasePizza createPizza(String type) {
        BasePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new NewYorkStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
