package xyz.hooy.frameworkthink.chain.shengsheng;

import java.util.ArrayList;
import java.util.List;

/**
 * 各个 Validator 之间是没有关系的，通过 ValidatorContext 让它们共享上下文，关联起来。
 */
public class ValidatorContext {

    private final List<String> errorMessages = new ArrayList<>();

    private boolean stop = false;

    public void appendErrorMessage(String message) {
        errorMessages.add(message);
    }

    public void throwExceptionIfNecessary() throws ValidatorException {
        if (!errorMessages.isEmpty()) {
            throw new ValidatorException(errorMessages.toString());
        }
    }

    /**
     * 此方法可以中断校验链
     */
    public void stopChain(){
        this.stop = true;
    }

    public boolean shouldStop(){
        return stop;
    }
}
