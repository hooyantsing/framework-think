package xyz.hooy.frameworkthink.factory;

public interface Connect {

    void open();

    void close();

    boolean isConnect();

    void write(String message);

    String read();
}
