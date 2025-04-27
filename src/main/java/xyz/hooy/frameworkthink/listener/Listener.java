package xyz.hooy.frameworkthink.listener;

/**
 * 监听器
 */
@FunctionalInterface
public interface Listener<T extends Event> {

    void onEvent(T event);
}
