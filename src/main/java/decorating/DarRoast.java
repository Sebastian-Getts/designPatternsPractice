package decorating;

/**
 * @author sebastian
 * @date 6/12/20 8:02 PM
 */
public class DarRoast extends BaseBeverage {

    public DarRoast() {
        description = "Brazil Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.05;
    }
}
