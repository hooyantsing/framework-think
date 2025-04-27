package xyz.hooy.frameworkthink.factory.generics_factory.impl;

import xyz.hooy.frameworkthink.factory.generics_factory.Connect;
import xyz.hooy.frameworkthink.factory.generics_factory.ConnectException;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class SocketConnect implements Connect {

    private final String host;
    private final int port;

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public SocketConnect(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void open() {
        close();
        try {
            this.socket = new Socket(host, port);
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            throw new ConnectException(e);
        }
    }

    @Override
    public void close() {
        if (isConnect()) {
            try {
                reader.close();
                writer.close();
                socket.close();
            } catch (IOException ignore) {}
        }
    }

    @Override
    public boolean isConnect() {
        return Objects.nonNull(socket) && socket.isConnected();
    }

    @Override
    public void write(String message) {
        if (!isConnect()) {
            throw new ConnectException("Connect is closed!");
        }
        writer.write(message);
    }

    @Override
    public String read() {
        if (!isConnect()) {
            throw new ConnectException("Connect is closed!");
        }
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new ConnectException(e);
        }
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
