package xyz.hooy.frameworkthink.builder;

public class House {
    private final String foundation; // 基础
    private final String walls; // 墙壁
    private final String roof; // 屋顶
    private final String windows; // 窗户
    private final String doors; // 门

    // 私有构造函数，只有通过 Builder 可以创建实例
    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.windows = builder.windows;
        this.doors = builder.doors;
    }

    @Override
    public String toString() {
        return "This house has a " + foundation + ", " + walls + ", " + roof +
                ", with " + windows + " and " + doors + ".";
    }

    // 静态内部类 Builder
    public static class Builder {
        // 必须的部分
        private final String foundation;
        private final String walls;

        // 可选的部分
        private String roof = "Standard Roof";
        private String windows = "Standard Windows";
        private String doors = "Standard Doors";

        // 构造函数，初始化必填字段
        public Builder(String foundation, String walls) {
            this.foundation = foundation;
            this.walls = walls;
        }

        // 设置可选字段的方法
        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public Builder doors(String doors) {
            this.doors = doors;
            return this;
        }

        // 返回最终构建的 House 对象
        public House build() {
            return new House(this);
        }
    }
}