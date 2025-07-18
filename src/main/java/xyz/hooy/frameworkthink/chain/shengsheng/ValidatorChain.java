package xyz.hooy.frameworkthink.chain.shengsheng;

import xyz.hooy.frameworkthink.chain.shengsheng.handler.ValidatorHandler;

import java.util.ArrayList;
import java.util.List;

public class ValidatorChain {

    private final List<ValidatorHandler> validatorHandlerList = new ArrayList<>();

    private final ValidatorContext validatorContext = new ValidatorContext();

    public void validate(Object value) {
        for (ValidatorHandler validatorHandler : validatorHandlerList) {
            validatorHandler.validate(value, validatorContext);
            if (validatorContext.shouldStop()) {
                break;
            }
        }
        validatorContext.throwExceptionIfNecessary();
    }

    public void addLastValidatorHandler(ValidatorHandler validatorHandler) {
        validatorHandlerList.add(validatorHandler);
    }
}
