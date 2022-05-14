import observer.CurrentConditionDisplay;
import observer.ForecastDisplay;
import observer.Observer;
import observer.WeaherData;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeaherData weaherData = new WeaherData();

        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weaherData);
        ForecastDisplay display2 = new ForecastDisplay(weaherData);

        display1.update(24, 33, 55);
//        display2.update(25, 38, 57);
    }
}
