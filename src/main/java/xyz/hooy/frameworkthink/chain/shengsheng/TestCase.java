package xyz.hooy.frameworkthink.chain.shengsheng;

import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Length;
import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Max;
import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Min;

public class TestCase {

    public static void main(String[] args) throws Exception {
        User hooy = new User("hooy", 18);
        Validator validator = new Validator();
        validator.validate(hooy);
    }

    public record User(@Length(length = 4) String name, @Min(min = 0) @Max(max = 100) Integer age) {
    }
}
