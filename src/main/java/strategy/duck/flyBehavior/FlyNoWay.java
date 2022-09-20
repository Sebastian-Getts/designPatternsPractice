package strategy.duck.flyBehavior;

/**
 * @author sebastiangetts
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        // can not fly
        System.out.println("I can't fly.");
    }
}
