package xyz.hooy.frameworkthink.observer.spring;

import java.util.EventObject;

/**
 * 事件
 */
public class Event extends EventObject {

    private final long timeStamp;

    public Event(Object source) {
        super(source);
        this.timeStamp = System.currentTimeMillis();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
