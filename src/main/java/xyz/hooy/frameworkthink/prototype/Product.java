package xyz.hooy.frameworkthink.prototype;

public class Product implements Cloneable {

    private final String name;

    private Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone(); // 需要支持深拷贝
    }
}