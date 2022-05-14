package observer_message_publisher;

public class MessageSubscriberThree implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}
