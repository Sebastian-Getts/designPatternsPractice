package singleton;

/**
 * @author sebastian
 * @date 6/14/20 9:54 PM
 */
public class Single {
    private volatile static Single uniqueInstance;

    private Single() {
    }

    public void drink() {
        System.out.println("I wanna drink a glass of juice...");
    }

    public static Single getInstance() {
        if (uniqueInstance == null) {
            synchronized (Single.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Single();
                }
            }
        }
        return uniqueInstance;
    }
}
