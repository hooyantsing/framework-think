package xyz.hooy.frameworkthink.adapter;

import java.io.IOException;

public class TestCase {

    public static void main(String[] args) throws IOException {
        Connection connect = new SocketConnection("127.0.0.1", 8080);
        connect.connect();
        String message = connect.readLine();
        System.out.println(message);
    }
}
