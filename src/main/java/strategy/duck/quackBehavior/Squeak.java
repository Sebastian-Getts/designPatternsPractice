package strategy.duck.quackBehavior;

import strategy.duck.quackBehavior.QuackBehavior;

/**
 * @author sebastiangetts
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
