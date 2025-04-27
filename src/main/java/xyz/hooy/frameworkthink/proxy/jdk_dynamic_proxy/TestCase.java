package xyz.hooy.frameworkthink.proxy.jdk_dynamic_proxy;

import xyz.hooy.frameworkthink.proxy.MessageSender;
import xyz.hooy.frameworkthink.proxy.SampleMessageSender;

import java.lang.reflect.Proxy;

public class TestCase {

    public static void main(String[] args) {
        MessageSender sampleMessageSender = new SampleMessageSender();
        MessageSender enhanceMessageSender = (MessageSender) Proxy.newProxyInstance(sampleMessageSender.getClass().getClassLoader(),
                sampleMessageSender.getClass().getInterfaces(),
                new EnhanceMessageSenderInvocationHandler(sampleMessageSender));
        enhanceMessageSender.send("Hello Proxy!");
    }
}
