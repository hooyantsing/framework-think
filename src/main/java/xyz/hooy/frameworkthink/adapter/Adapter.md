## 适配器 *Adapter*

有两套功能近似的框架体系，但这两套框架使用了不同的接口和实现，如果 B 框架想使用 A 框架里某个实现类，只需要创建一个 Adapter 继承 A 框架的实现类和实现 B 框架的接口，这样 Adapter(基于 A 实现) 可以应用到 B 框架当中了。

通常我们自己实现了一套处理流程，这套流程基于接口和抽象类编写，此时想使用外部实现类，就可以继承外部实现类并且实现自己编写的接口加入到自己处理流程当中。