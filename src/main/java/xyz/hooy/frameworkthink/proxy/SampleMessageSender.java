package xyz.hooy.frameworkthink.proxy;

public class SampleMessageSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Sending: " + message);
    }
}
