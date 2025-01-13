package xyz.hooy.frameworkthink.listen;

/**
 * 存储多个监听器的容器
 */
public interface ListenMulticaster {

    void addListener(Listener<?> listener);

    void removeListener(Listener<?> listener);

    void multicastEvent(Event event);
}
