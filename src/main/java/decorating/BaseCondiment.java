package decorating;

/**
 * 调味料
 *
 * @author sebastian
 * @date 6/12/20 6:46 PM
 */
public abstract class BaseCondiment extends BaseBeverage {

    /**
     * 调味料重写描述，需要在被装饰物品后添加自身调味料的名称
     *
     * @return 调味料名称
     */
    @Override
    public abstract String getDescription();
}
