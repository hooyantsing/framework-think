# SpringFrameworkNote

> Author: Hooy



## 随记

### 工具类

工具类命名：`*Utils` `*Supports`  `*Helper`；

工具类仅提供 static 方法，以下两种防止工具类实例化的方式：

```java
public final class Utils { // 禁止继承
    
    private Utils(){} // 私有化构造方法
}
```

```java
public abstract class Utils { // 抽象类不可实例化
}
```

### 风格

BeanFactory 和 ApplicationContext 功能扩展已是一种渐进式的，通过继承父类和实现新接口逐步扩展功能点。

通常在接口里定义 `get` ``contains` 方法，而在它的实现类里定义 `set`  方法。这样在外部以接口为声明的实现类对象，避免通过 `set` 方法改变对象内部数据，更安全可靠。







## Environment 环境变量