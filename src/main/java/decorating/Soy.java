package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:57 PM
 */
public class Soy extends Condiment {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }
}
