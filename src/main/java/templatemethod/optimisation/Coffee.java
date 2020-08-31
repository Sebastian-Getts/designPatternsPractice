package templatemethod.optimisation;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class Coffee extends AbstractCaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
