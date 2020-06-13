package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:57 PM
 */
public class Soy extends BaseCondiment {
    BaseBeverage baseBeverage;

    public Soy(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .50 + baseBeverage.cost();
    }
}
