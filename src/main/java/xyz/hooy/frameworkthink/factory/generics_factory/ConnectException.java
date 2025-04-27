package xyz.hooy.frameworkthink.factory.generics_factory;

public class ConnectException extends RuntimeException{

    public ConnectException() {
        this("Connection failed!");
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
