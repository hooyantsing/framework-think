package xyz.hooy.frameworkthink.listen;

public class ListenException extends RuntimeException{

    public ListenException() {
        super();
    }

    public ListenException(String message) {
        super(message);
    }

    public ListenException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListenException(Throwable cause) {
        super(cause);
    }
}
