package Observer.improve;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private float temperatrue;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		notifyObservers();
	}

	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	@Override
	public void registerObserve(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(int i = 0;i<observers.size();i++){
			observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
		}
	}
}
