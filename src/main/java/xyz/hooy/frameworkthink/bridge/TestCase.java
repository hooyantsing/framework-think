package xyz.hooy.frameworkthink.bridge;

import xyz.hooy.frameworkthink.bridge.driver.Driver;
import xyz.hooy.frameworkthink.bridge.driver.MysqlDriver;

public class TestCase {

    public static void main(String[] args) {
        Driver mysqlDriver = new MysqlDriver();
        Database database = new DefaultDatabase(mysqlDriver);
        System.out.println(database.query("SELECT * FROM EXAMPLE"));
    }
}
