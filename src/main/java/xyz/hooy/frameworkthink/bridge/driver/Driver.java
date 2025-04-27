package xyz.hooy.frameworkthink.bridge.driver;

public interface Driver {

    void connect();

    void write(String command);

    String read();
}
