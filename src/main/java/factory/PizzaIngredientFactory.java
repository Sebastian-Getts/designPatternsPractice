package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:44 PM
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
