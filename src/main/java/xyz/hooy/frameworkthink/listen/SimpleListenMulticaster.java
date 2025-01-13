package xyz.hooy.frameworkthink.listen;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

public class SimpleListenMulticaster implements ListenMulticaster {

    private final Set<Listener<Event>> listeners = new HashSet<>();

    @Override
    public void addListener(Listener<?> listener) {
        listeners.add((Listener<Event>) listener);
    }

    @Override
    public void removeListener(Listener<?> listener) {
        listeners.remove(listener);
    }

    @Override
    public void multicastEvent(Event event) {
        for (Listener<Event> listener : listeners) {
            if (supportsEvent(listener, event)) { // 判断 listener 是否对 event 感兴趣
                listener.onEvent(event);
            }
        }
    }

    protected boolean supportsEvent(Listener<Event> listener, Event event) {
        Type type = listener.getClass().getGenericInterfaces()[0];
        Type actualTypeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];
        String className = actualTypeArgument.getTypeName();
        Class<?> eventClassName;
        try {
            eventClassName = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new ListenException("Wrong event class name: " + className);
        }
        return eventClassName.isAssignableFrom(event.getClass());
    }
}
