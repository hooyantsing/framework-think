package xyz.hooy.frameworkthink.listener;

/**
 * 存储多个监听器的容器
 */
public interface EventMulticaster {

    void addListener(Listener<?> listener);

    void removeListener(Listener<?> listener);

    void multicastEvent(Event event);
}
