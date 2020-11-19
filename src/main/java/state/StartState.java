package state;

/**
 * @author sebastian
 * @date 11/20/20
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("this is start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
