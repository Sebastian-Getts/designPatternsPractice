package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:44 PM
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * sub beverage cost
     *
     * @return price
     */
    public abstract double cost();
}
