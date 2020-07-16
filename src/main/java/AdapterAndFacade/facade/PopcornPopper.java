package AdapterAndFacade.facade;

/**
 * @author sebastian
 * @date 2020/7/16
 * @description 爆米花，看电影前准备的
 */
public class PopcornPopper {
    public void on() {
        System.out.println("Popcorn popper prepared...");
    }

    public void off() {
        System.out.println("Popcorn popper done...");
    }

    public void pop() {
        System.out.println("Popcorn popper is popping...");
    }
}
