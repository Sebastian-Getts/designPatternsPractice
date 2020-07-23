package singleton;

/**
 * @author sebastian
 * @date 6/14/20 9:58 PM
 */
public class SingleTestDrive {

    public static void main(String[] args) {
        System.out.println(Single.getInstance() == Single.getInstance());
        System.out.println("=============================");
        System.out.println(Single2.getInstance() == Single2.getInstance());
        Single2.getInstance().sing();
    }
}
