package AdapterAndFacade;

/**
 * @author sebastian
 * @description
 * @date 2020/7/16
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
