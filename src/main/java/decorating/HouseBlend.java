package decorating;

/**
 * @author sebastian
 * @date 6/12/20 6:51 PM
 */
public class HouseBlend extends BaseBeverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .79;
    }
}
