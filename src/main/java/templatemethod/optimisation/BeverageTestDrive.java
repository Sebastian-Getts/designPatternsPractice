package templatemethod.optimisation;

/**
 * @author sebastian
 * @date 2020/8/31
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
