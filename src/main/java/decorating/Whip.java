package decorating;

/**
 * @author sebastian
 * @date 6/12/20 7:00 PM
 */
public class Whip extends BaseCondiment {
    BaseBeverage baseBeverage;

    public Whip(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .30 + baseBeverage.cost();
    }
}
