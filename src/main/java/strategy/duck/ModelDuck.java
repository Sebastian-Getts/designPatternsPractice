package strategy.duck;

import strategy.duck.flyBehavior.FlyNoWay;
import strategy.duck.quackBehavior.Quack;

/**
 * @author sebastiangetts
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
