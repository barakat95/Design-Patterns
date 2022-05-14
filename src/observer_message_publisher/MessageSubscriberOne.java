package observer_message_publisher;

public class MessageSubscriberOne implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
