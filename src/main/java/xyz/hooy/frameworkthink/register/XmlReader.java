package xyz.hooy.frameworkthink.register;

import java.nio.file.Path;

/**
 * 将注册容器作为构造器参数传入进来；
 * 实现不同规则（XML，Properties）读取器创建对象并注册到容器。
 */
public class XmlReader implements Reader{

    private final Register register;

    public XmlReader(Register register){
        this.register = register;
    }
    @Override
    public void loadDefinitions(Path path) {
        Object object = new Object();
        // TODO：XML 解析规则
        register.register(object);
    }
}
