package observer;

/**
 * 主题，所有的主题都应实现这一接口。
 * 通过registerObserver, removeObserver可以发现，主题与观察者在接口处实现的“耦合”
 *
 * @author sebastian
 * @date 6/12/20 3:44 PM
 */
public interface Subject {

    /**
     * 注册为观察者
     *
     * @param observer an Observer instance
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer an Observer instance
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
