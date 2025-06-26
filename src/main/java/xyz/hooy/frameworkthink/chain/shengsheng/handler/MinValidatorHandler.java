package xyz.hooy.frameworkthink.chain.shengsheng.handler;

import xyz.hooy.frameworkthink.chain.shengsheng.ValidatorContext;

public class MinValidatorHandler implements ValidatorHandler {

    private final int min;

    public MinValidatorHandler(int min) {
        this.min = min;
    }

    @Override
    public void validate(Object object, ValidatorContext context) {
        if (object instanceof Integer integer) {
            if (integer < min) {
                context.appendErrorMessage(integer + " < min(" + min + ")");
                context.stopChain(); // 中断校验链，不再执行下一个校验器
            }
        }
    }
}
