package xyz.hooy.frameworkthink.bridge.driver;

public class MysqlDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("connect to mysql");
    }

    @Override
    public void write(String command) {
        System.out.println("write to mysql: " + command);
    }

    @Override
    public String read() {
        return "read from mysql";
    }
}
