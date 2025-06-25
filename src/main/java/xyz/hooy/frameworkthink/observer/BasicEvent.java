package xyz.hooy.frameworkthink.observer;

import java.util.EventObject;

public abstract class BasicEvent extends EventObject {

    private final long timestamp = System.currentTimeMillis();

    public BasicEvent() {
        this(null);
    }

    public BasicEvent(Object source) {
        super(source);
    }

    public long getTimestamp() {
        return timestamp;
    }
}
