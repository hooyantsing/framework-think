package xyz.hooy.frameworkthink.chain.shengsheng;

import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Length;
import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Max;
import xyz.hooy.frameworkthink.chain.shengsheng.annotation.Min;
import xyz.hooy.frameworkthink.chain.shengsheng.handler.LengthValidatorHandler;
import xyz.hooy.frameworkthink.chain.shengsheng.handler.MaxValidatorHandler;
import xyz.hooy.frameworkthink.chain.shengsheng.handler.MinValidatorHandler;

import java.lang.reflect.Field;

/**
 * 验证注解处理器
 */
public class Validator {

    public void validate(Object object) throws Exception {
        Class<?> objectClass = object.getClass();
        for (Field field : objectClass.getFields()) {
            field.setAccessible(true);
            ValidatorChain validatorChain = buildValidatorChain(field);
            validatorChain.validate(field.get(object));
        }
    }

    private ValidatorChain buildValidatorChain(Field field) {
        ValidatorChain validatorChain = new ValidatorChain();
        Max maxAnnotation = field.getAnnotation(Max.class);
        if (maxAnnotation != null) {
            validatorChain.addLastValidatorHandler(new MaxValidatorHandler(maxAnnotation.max()));
        }
        Min minAnnotation = field.getAnnotation(Min.class);
        if (minAnnotation != null) {
            validatorChain.addLastValidatorHandler(new MinValidatorHandler(minAnnotation.min()));
        }
        Length lengthAnnotation = field.getAnnotation(Length.class);
        if (lengthAnnotation != null) {
            validatorChain.addLastValidatorHandler(new LengthValidatorHandler(lengthAnnotation.length()));
        }
        return validatorChain;
    }
}
