package Observer;

public class Client {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData(currentConditions);
		
		weatherData.setData(30, 150, 40);
		
		System.out.println("============更新=============");
		weatherData.setData(40, 160, 20);
		

	}
}
