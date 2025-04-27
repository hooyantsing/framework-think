package xyz.hooy.frameworkthink.factory.simple_factory;

public class Products {

    public static Product newInstance(String name) {
        return new Product(name);
    }

    public final static class Product {

        private final String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
