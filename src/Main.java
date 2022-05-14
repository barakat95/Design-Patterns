import observer_message_publisher.*;

public class Main {
    public static void main(String[] args) {
//        WeaherData weaherData = new WeaherData();
//
//        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weaherData);
//        ForecastDisplay display2 = new ForecastDisplay(weaherData);
//
//        display1.update(24, 33, 55);
//        display2.update(25, 38, 57);


        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        Publisher p = new Publisher();

        p.attach(s1);
        p.attach(s2);
        p.attach(s3);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
//        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update


    }
}
