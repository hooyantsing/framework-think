package xyz.hooy.frameworkthink.validation.handler;

import xyz.hooy.frameworkthink.validation.ValidatorContext;

public class MaxValidatorHandler implements ValidatorHandler {

    private final int max;

    public MaxValidatorHandler(int max) {
        this.max = max;
    }

    @Override
    public void validate(Object object, ValidatorContext context) {
        if (object instanceof Integer integer) {
            if (integer > max) {
                context.appendErrorMessage(integer + " > max(" + max + ")");
            }
        }
    }
}
