package factory;

/**
 * @author sebastian
 * @date 6/14/20 8:23 PM
 */
public abstract class BasePizzaStore {

    public BasePizza orderPizza(String type) {
        BasePizza basePizza;

        basePizza = createPizza(type);
        basePizza.prepare();
        basePizza.bake();
        basePizza.cut();
        basePizza.box();

        return basePizza;
    }

    /**
     * 创建批萨
     *
     * @param type 批萨类型
     * @return 批萨
     */
    abstract BasePizza createPizza(String type);

}
