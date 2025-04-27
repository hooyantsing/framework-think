package xyz.hooy.frameworkthink.decorator.impl;

import xyz.hooy.frameworkthink.decorator.AbstractSourceDecorator;
import xyz.hooy.frameworkthink.decorator.Source;

import java.util.function.Predicate;

/**
 * 过滤器
 */
public class SourceFilter extends AbstractSourceDecorator {

    private final Predicate<String> predicate;

    public SourceFilter(Source source, Predicate<String> predicate) {
        super(source);
        this.predicate = predicate;
    }


    @Override
    public void todo(String command) {
        if (predicate.test(command)) {
            source.todo(command);
        }
    }
}
