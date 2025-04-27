package xyz.hooy.frameworkthink.adapter;

import java.io.IOException;

public interface Connect {

    void connect() throws IOException;

    String readLine() throws IOException;
}
