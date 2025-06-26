package xyz.hooy.frameworkthink.observer.spring;

/**
 * 监听器
 */
@FunctionalInterface
public interface Listener<T extends Event> {

    void onEvent(T event);
}
