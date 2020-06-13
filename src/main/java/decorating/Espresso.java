package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:49 PM
 */
public class Espresso extends BaseBeverage {

    public Espresso() {
        description = "Delicious Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
