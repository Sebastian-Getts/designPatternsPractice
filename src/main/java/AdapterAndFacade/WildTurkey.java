package AdapterAndFacade;

/**
 * @author sebastian
 * @description
 * @date 2020/7/16
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
