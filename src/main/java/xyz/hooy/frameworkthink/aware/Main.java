package xyz.hooy.frameworkthink.aware;

public class Main {

    private final static Context CONTEXT = new Context("Context");

    public static void main(String[] args) {
        Object object = getObject();
        if (object instanceof ContextAware) {
            ContextAware contextAware = (ContextAware) object;
            contextAware.setContext(CONTEXT); // 实现 ContextAware 接口的对象都持有了 context 对象
        }
    }

    public static Object getObject() {
        return new Bean();
    }
}
