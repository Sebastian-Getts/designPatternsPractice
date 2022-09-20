package strategy.duck;

import strategy.duck.flyBehavior.FlyWithWings;
import strategy.duck.quackBehavior.Quack;

/**
 * @author sebastiangetts
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck.");
    }
}
