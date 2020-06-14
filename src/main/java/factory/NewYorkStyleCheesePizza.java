package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:27 PM
 */
public class NewYorkStyleCheesePizza extends BasePizza {
    PizzaIngredientFactory ingredientFactory;

    public NewYorkStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
    }
}
