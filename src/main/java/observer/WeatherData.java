package observer;

import java.util.ArrayList;

/**
 * @author sebastian
 * @date 6/12/20 3:49 PM
 */
public class WeatherData implements Subject {
    private final ArrayList<Observer> observerArrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerArrayList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerArrayList.indexOf(observer);
        if (i >= 0) {
            observerArrayList.remove(i);
        }
    }

    /**
     * 通知时，遍历观察者列表，给每个观察者通知
     */
    @Override
    public void notifyObservers() {
        for (Object o : observerArrayList) {
            Observer observer = (Observer) o;
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 测试用
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    压强
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
