package xyz.hooy.frameworkthink.observer.spring;

public class ListenerException extends RuntimeException{

    public ListenerException() {
        super();
    }

    public ListenerException(String message) {
        super(message);
    }

    public ListenerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListenerException(Throwable cause) {
        super(cause);
    }
}
