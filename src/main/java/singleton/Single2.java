package singleton;

/**
 * @author sebastian
 * @date 2020/7/23
 * @description 静态内部类实现单例模式，有JVM提供线程安全，又因为静态内部类，所以也是延迟的。
 */
public class Single2 {

    /**
     * 私有，防止外部用来创建实例
     */
    private Single2() {
    }

    public void sing() {
        System.out.println("I am singing...");
    }

    /**
     * 对外获取实例的途径
     *
     * @return Single2 instance
     */
    public static Single2 getInstance() {
        return SingleHolder.INSTANCE;
    }

    /**
     * 静态内部类
     * 创建不依赖外部类
     * 不能使用任何外部类的非static的变量和方法
     */
    private static class SingleHolder {
        private static final Single2 INSTANCE = new Single2();
    }

}
