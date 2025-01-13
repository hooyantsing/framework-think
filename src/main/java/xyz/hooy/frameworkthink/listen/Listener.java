package xyz.hooy.frameworkthink.listen;

/**
 * 监听器
 */
@FunctionalInterface
public interface Listener<T extends Event> {

    void onEvent(T event);
}
