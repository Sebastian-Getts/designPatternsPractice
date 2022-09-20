package strategy.duck.quackBehavior;

/**
 * @author sebastiangetts
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        // common duck quack
        System.out.println("Quack.");
    }
}
