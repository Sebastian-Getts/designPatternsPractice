package strategy.duck.flyBehavior;

/**
 * @author sebastiangetts
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        // common fly with wings
        System.out.println("I'm flying!!");
    }
}
