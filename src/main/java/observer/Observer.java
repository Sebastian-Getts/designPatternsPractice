package observer;

/**
 * 观察者，所有的观察者应实现这一接口
 *
 * @author sebastian
 * @date 6/12/20 3:46 PM
 */
public interface Observer {

    /**
     * 观察者更新状态
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temp, float humidity, float pressure);
}
