package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:52 PM
 */
public class Mocha extends BaseCondiment {
    private static final String NAME = "Mocha";

    /**
     * delegate object
     */
    BaseBeverage baseBeverage;

    public Mocha(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", " + NAME;
    }

    @Override
    public double cost() {
        return .20 + baseBeverage.cost();
    }
}
