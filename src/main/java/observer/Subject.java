package observer;

/**
 * @author sebastian
 * @date 6/12/20 3:44 PM
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
