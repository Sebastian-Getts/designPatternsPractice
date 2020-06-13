package decorating;

/**
 * @author sebastian
 * @date 6/12/20 8:00 PM
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        BaseBeverage baseBeverage = new Espresso();
        System.out.println(baseBeverage.getDescription() + " $" + baseBeverage.cost());

        BaseBeverage baseBeverage1 = new DarRoast();
        baseBeverage1 = new Mocha(baseBeverage1);
        baseBeverage1 = new Mocha(baseBeverage1);
        baseBeverage1 = new Whip(baseBeverage1);
        System.out.println(baseBeverage1.getDescription() + " $" + baseBeverage1.cost());

        BaseBeverage baseBeverage2 = new HouseBlend();
        baseBeverage2 = new Soy(baseBeverage2);
        baseBeverage2 = new Mocha(baseBeverage2);
        baseBeverage2 = new Whip(baseBeverage2);
        System.out.println(baseBeverage2.getDescription() + " $" + baseBeverage2.cost());
    }
}
