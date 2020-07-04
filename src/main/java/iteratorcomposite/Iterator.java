package iteratorcomposite;

/**
 * @author sebastian
 * @date 7/5/20 1:41 AM
 */
public interface Iterator {

    /**
     * a boolean indicating whether or not there are more elements to iterate over...
     *
     * @return true|false
     */
    boolean hasNext();

    /**
     * the next element
     *
     * @return Object
     */
    Object next();
}
