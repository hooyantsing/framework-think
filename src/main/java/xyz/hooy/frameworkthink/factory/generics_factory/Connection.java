package xyz.hooy.frameworkthink.factory.generics_factory;

public interface Connection {

    void open();

    void close();

    boolean isConnect();

    void write(String message);

    String read();
}
