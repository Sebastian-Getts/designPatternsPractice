package strategy;

/**
 * @author sebastian
 * @date 11/22/20
 */
public class StrategyDriver {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        Context context1 = new Context(new SubtractOperation());
        System.out.println("10 - 5 = " + context1.executeStrategy(10, 5));

        Context context2 = new Context(new MultiplyOperation());
        System.out.println("10 x 5 = " + context2.executeStrategy(10, 5));
    }
}
