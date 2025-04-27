package xyz.hooy.frameworkthink.proxy.jdk_dynamic_proxy;

import xyz.hooy.frameworkthink.proxy.MessageSender;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EnhanceMessageSenderInvocationHandler implements InvocationHandler {

    private final MessageSender messageSender;

    public EnhanceMessageSenderInvocationHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Send before.");
        Object result = method.invoke(messageSender, args);
        System.out.println("Send after.");
        return result;
    }
}
