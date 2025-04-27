package xyz.hooy.frameworkthink.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketConnect implements Connect {

    private final String ip;
    private final int port;

    private Socket socket;
    private BufferedReader reader;

    public SocketConnect(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }


    @Override
    public void connect() throws IOException {
        this.socket = new Socket(ip, port);
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }
}
