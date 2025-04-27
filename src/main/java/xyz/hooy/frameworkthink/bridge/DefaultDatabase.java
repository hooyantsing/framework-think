package xyz.hooy.frameworkthink.bridge;

import xyz.hooy.frameworkthink.bridge.driver.Driver;

public class DefaultDatabase implements Database {

    private final Driver driver;

    public DefaultDatabase(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String query(String sql) {
        driver.connect();
        driver.write(sql);
        return driver.read();
    }
}
