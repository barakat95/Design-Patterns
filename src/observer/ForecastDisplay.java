package observer;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer, display{

    float temp;
    List<Observer> observers;
    WeaherData weaherData;

    public ForecastDisplay(WeaherData weaherData) {
        observers = new ArrayList<>();
        this.weaherData = weaherData;
    }

    @Override
    public void update(float temp, float humadity, float pressure) {
        this.temp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("I am only display temprature : " + temp);
    }
}
