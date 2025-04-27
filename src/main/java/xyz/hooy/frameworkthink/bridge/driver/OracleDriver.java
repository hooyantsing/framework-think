package xyz.hooy.frameworkthink.bridge.driver;

public class OracleDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("connect to oracle");
    }

    @Override
    public void write(String command) {
        System.out.println("write to oracle: " + command);
    }

    @Override
    public String read() {
        return "read from oracle";
    }
}
