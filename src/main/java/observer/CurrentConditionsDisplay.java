package observer;

/**
 * 展览模块
 *
 * @author sebastian
 * @date 6/12/20 4:03 PM
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final Subject subject;

    /**
     * 展览块的构造方法，作为一个观察者，初始化时需要指定一个主题
     *
     * @param subject 主题
     */
    public CurrentConditionsDisplay(Subject subject) {
        // 这里可以给final的subject赋值是因为非静态，构造时可以赋值，一经复制不可更改
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void unregisterMySelf() {
        subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public Subject showSubjects() {
        return subject;
    }
}
