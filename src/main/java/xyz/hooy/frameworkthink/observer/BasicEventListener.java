package xyz.hooy.frameworkthink.observer;

import java.util.EventListener;

public interface BasicEventListener extends EventListener {

    void onEvent(BasicEvent event);
}
