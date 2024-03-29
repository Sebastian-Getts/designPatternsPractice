package strategy.calculator;

/**
 * a class that uses the strategy interface
 *
 * @author sebastian
 * @date 11/22/20
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
