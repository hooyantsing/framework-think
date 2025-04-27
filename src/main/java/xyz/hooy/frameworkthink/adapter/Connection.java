package xyz.hooy.frameworkthink.adapter;

import java.io.IOException;

public interface Connection {

    void connect() throws IOException;

    String readLine() throws IOException;
}
