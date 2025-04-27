package xyz.hooy.frameworkthink.factory.generics_factory.impl;

import xyz.hooy.frameworkthink.factory.generics_factory.ConnectionFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocketConnectionFactory implements ConnectionFactory<SocketConnection> {

    private final static Pattern pattern = Pattern.compile("TCPIP(?<board>[0-9]*)::(?<host>.+)::(?<port>[0-9]{1,5})::SOCKET");

    @Override
    public boolean isConnectable(String visaString) {
        return pattern.matcher(visaString).matches();
    }

    @Override
    public SocketConnection fromVisaString(String visaString) {
        Matcher matcher = pattern.matcher(visaString);
        if (!matcher.find()) {
            throw new IllegalArgumentException(SocketConnectionFactory.class.getName() + " cannot parse [" + visaString + "].");
        }
        String host = matcher.group("host");
        int port = Integer.parseInt(matcher.group("port"));
        return new SocketConnection(host, port);
    }

    @Override
    public String toVisaString(SocketConnection connect) {
        String host = connect.getHost();
        String port = String.valueOf(connect.getPort());
        return "TCPIP0::" + host + "::" + port + "::SOCKET";
    }
}
