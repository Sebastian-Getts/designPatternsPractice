package templatemethod.optimisation;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class Tea extends AbstractCaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
