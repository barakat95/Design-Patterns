package observer_weather;

import java.util.ArrayList;

public class WeaherData implements Subject{
    private ArrayList<Observer> observers;
    private float temp;
    private float humadity;
    private float pressure;

    public WeaherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humadity, pressure);
        }
    }

    public void onMessurementsChanged(){
        notifyObservers();
    }

    public void setMessurements(float temp, float humadity, float pressure){
        this.temp = temp;
        this.humadity = humadity;
        this.pressure = pressure;
        onMessurementsChanged();
    }
}
