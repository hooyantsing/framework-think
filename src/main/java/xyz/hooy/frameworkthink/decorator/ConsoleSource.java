package xyz.hooy.frameworkthink.decorator;

/**
 * 最终实现类
 */
public class ConsoleSource implements Source {

    @Override
    public void todo(String command) {
        System.out.println(command);
    }
}
