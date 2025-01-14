package xyz.hooy.frameworkthink.aware;

/**
 * 上下文对象感知接口
 */
public interface ContextAware extends Aware {

    void setContext(Context context);
}
