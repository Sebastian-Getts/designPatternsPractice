package observer;

/**
 * @author sebastian
 * @date 6/12/20 4:04 PM
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        observer.builtin.WeatherData weatherData1 = new observer.builtin.WeatherData();
        new observer.builtin.CurrentConditionsDisplay(weatherData1);
        weatherData1.setMeasurements(80, 65, 40.4f);
        weatherData1.setMeasurements(82, 70, 29.2f);
        weatherData1.setMeasurements(78, 90, 28.5f);
        System.out.println("==========================================================");
        weatherData.setMeasurements(80, 65, 40.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 28.5f);
    }
}
