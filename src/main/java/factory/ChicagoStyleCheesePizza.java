package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:31 PM
 */
public class ChicagoStyleCheesePizza extends BasePizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
