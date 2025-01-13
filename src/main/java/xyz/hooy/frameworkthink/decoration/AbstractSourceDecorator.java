package xyz.hooy.frameworkthink.decoration;

/**
 * 包装器基类
 */
public abstract class AbstractSourceDecorator implements Source {

    protected final Source source;

    protected AbstractSourceDecorator(Source source) {
        this.source = source;
    }
}
