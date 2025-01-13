package xyz.hooy.frameworkthink.factory.impl;

import xyz.hooy.frameworkthink.factory.ConnectFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocketConnectFactory implements ConnectFactory<SocketConnect> {

    private final static Pattern pattern = Pattern.compile("TCPIP(?<board>[0-9]*)::(?<host>.+)::(?<port>[0-9]{1,5})::SOCKET");

    @Override
    public boolean isConnectable(String visaString) {
        return pattern.matcher(visaString).matches();
    }

    @Override
    public SocketConnect fromVisaString(String visaString) {
        Matcher matcher = pattern.matcher(visaString);
        if (!matcher.find()) {
            throw new IllegalArgumentException(SocketConnectFactory.class.getName() + " cannot parse [" + visaString + "].");
        }
        String host = matcher.group("host");
        int port = Integer.parseInt(matcher.group("port"));
        return new SocketConnect(host, port);
    }

    @Override
    public String toVisaString(SocketConnect connect) {
        String host = connect.getHost();
        String port = String.valueOf(connect.getPort());
        return "TCPIP0::" + host + "::" + port + "::SOCKET";
    }
}
