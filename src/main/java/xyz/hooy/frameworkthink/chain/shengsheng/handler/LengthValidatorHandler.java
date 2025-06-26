package xyz.hooy.frameworkthink.chain.shengsheng.handler;

import xyz.hooy.frameworkthink.chain.shengsheng.ValidatorContext;

public class LengthValidatorHandler implements ValidatorHandler {

    private final int length;

    public LengthValidatorHandler(int length) {
        this.length = length;
    }

    @Override
    public void validate(Object object, ValidatorContext context) {
        if (object instanceof String string) {
            if (string.length() != length) {
                context.appendErrorMessage(string + " != length(" + length + ")");
            }
        }
    }
}
