package xyz.hooy.frameworkthink.chain.shengsheng.handler;

import xyz.hooy.frameworkthink.chain.shengsheng.ValidatorContext;

public interface ValidatorHandler {

    void validate(Object object, ValidatorContext context);
}
