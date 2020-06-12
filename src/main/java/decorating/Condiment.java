package decorating;

/**
 * 调味料
 *
 * @author sebastian
 * @date 6/12/20 6:46 PM
 */
public abstract class Condiment extends Beverage {

    /**
     * 调味料重写描述
     *
     * @return 调味料名称
     */
    @Override
    public abstract String getDescription();
}
