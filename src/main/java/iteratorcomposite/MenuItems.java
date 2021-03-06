package iteratorcomposite;

/**
 * @author sebastian
 * @date 7/5/20 1:09 AM
 */
public class MenuItems {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItems(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
