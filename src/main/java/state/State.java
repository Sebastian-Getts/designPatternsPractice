package state;

/**
 * state pattern
 *
 * @author sebastian
 * @date 11/20/20
 */
public interface State {

    /**
     * to change object's state
     *
     * @param context the star of the state pattern
     */
    void doAction(Context context);
}
