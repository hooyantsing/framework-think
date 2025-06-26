package xyz.hooy.frameworkthink.observer.shengsheng;

import java.util.*;

/**
 * 事件广播中介，生产者和消费者之间解耦。
 */
public class TvStation {

    private final Map<Class<?>, List<BasicEventListener>> eventListenerMap = new HashMap<>();

    public void addEventListener(Class<? extends BasicEvent> event, BasicEventListener eventListener) {
        List<BasicEventListener> eventListeners = eventListenerMap.computeIfAbsent(event, list -> new ArrayList<>());
        eventListeners.add(eventListener);
    }

    public void publish(BasicEvent event) {
        List<BasicEventListener> eventListeners = eventListenerMap.get(event.getClass());
        for (BasicEventListener eventListener : eventListeners) {
            eventListener.onEvent(event);
        }
    }
}
