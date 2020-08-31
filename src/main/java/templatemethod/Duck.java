package templatemethod;

/**
 * Comparable可以作为sort中的模板方法来看，
 * 要实现sort，comparable是用户自定义的部分，是整个排序中的一步
 *
 * @author sebastian
 * @date 2020/8/31
 */
public class Duck implements Comparable<Object> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", wight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck o1 = (Duck) o;
        return Integer.compare(this.weight, o1.weight);
    }
}
