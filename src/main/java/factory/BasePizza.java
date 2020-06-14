package factory;

import java.util.ArrayList;

/**
 * @author sebastian
 * @date 6/14/20 8:01 PM
 */
public abstract class BasePizza {
    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<String> toppings = new ArrayList<>();

    /**
     * prepare pizza
     */
    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
