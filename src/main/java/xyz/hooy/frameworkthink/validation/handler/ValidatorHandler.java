package xyz.hooy.frameworkthink.validation.handler;

import xyz.hooy.frameworkthink.validation.ValidatorContext;

public interface ValidatorHandler {

    void validate(Object object, ValidatorContext context);
}
