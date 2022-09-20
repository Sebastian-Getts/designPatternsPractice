package strategy.duck.quackBehavior;

/**
 * @author sebastiangetts
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
