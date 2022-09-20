package strategy.calculator;

/**
 * @author sebastian
 * @date 11/22/20
 */
public interface Strategy {

    /**
     * strategy interface, do something
     *
     * @param num1 number
     * @param num2 number
     * @return two number operation result
     */
    int doOperation(int num1, int num2);
}
