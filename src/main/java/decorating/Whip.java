package decorating;

/**
 * @author sebastian
 * @date 6/12/20 7:00 PM
 */
public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
