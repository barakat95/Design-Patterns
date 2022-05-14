package observer;

public class CurrentConditionDisplay implements Observer, display{
    private float temp;
    private float humadity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.removeObserver(this);
    }

    @Override
    public void update(float temp, float humadity, float pressure) {
        this.temp = temp;
        this.humadity = humadity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temp + " Humadity " + humadity + " Pressure " + pressure);
    }
}
