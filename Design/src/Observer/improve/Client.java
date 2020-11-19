package Observer.improve;

/**
 * @author
 * @create 2020-09-23 20:12
 */
public class Client {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentConditions conditions = new CurrentConditions();
        data.registerObserve(conditions);
        data.setData(10,10,10);
    }
}
