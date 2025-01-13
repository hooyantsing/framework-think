package xyz.hooy.frameworkthink.decoration.impl;

import xyz.hooy.frameworkthink.decoration.AbstractSourceDecorator;
import xyz.hooy.frameworkthink.decoration.Source;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * 追踪器
 */
public class SourceTracer extends AbstractSourceDecorator {

    private final PrintWriter writer;

    public SourceTracer(Source source, OutputStream outputStream) {
        super(source);
        this.writer = new PrintWriter(outputStream);
    }

    @Override
    public void todo(String command) {
        writer.write(command);
        source.todo(command);
    }
}
