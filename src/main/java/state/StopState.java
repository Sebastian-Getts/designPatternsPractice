package state;

/**
 * @author sebastian
 * @date 11/20/20
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("this is stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
