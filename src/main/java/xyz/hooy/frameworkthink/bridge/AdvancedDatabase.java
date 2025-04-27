package xyz.hooy.frameworkthink.bridge;

import xyz.hooy.frameworkthink.bridge.driver.Driver;

/**
 * 可以对基本的 Database 进一步扩展
 */
public class AdvancedDatabase extends DefaultDatabase {

    public AdvancedDatabase(Driver driver) {
        super(driver);
    }
}
