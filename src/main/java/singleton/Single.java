package singleton;

/**
 * @author sebastian
 * @date 6/14/20 9:54 PM
 */
public class Single {
    /**
     * 静态初始化，volatile保证线程可见，提高锁效率
     */
    private volatile static Single uniqueInstance;

    /**
     * 构造函数私有，只能在类内部调用
     */
    private Single() {
    }

    public void drink() {
        System.out.println("I wanna drink a glass of juice...");
    }

    /**
     * 静态方法
     * 双重判断
     *
     * @return Single instance
     */
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
