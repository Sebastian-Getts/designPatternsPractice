package strategy;

/**
 * @author sebastian
 * @date 11/22/20
 */
public class MultiplyOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
