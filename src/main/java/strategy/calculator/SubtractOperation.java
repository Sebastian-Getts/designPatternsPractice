package strategy.calculator;

/**
 * @author sebastian
 * @date 11/22/20
 */
public class SubtractOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
