package xyz.hooy.frameworkthink.factory;

public class ConnectException extends RuntimeException{

    public ConnectException() {
        this("Connect failed!");
    }

    public ConnectException(String message) {
        super(message);
    }

    public ConnectException(Throwable cause) {
        super(cause);
    }

    public ConnectException(String message, Throwable cause) {
        super(message, cause);
    }
}
