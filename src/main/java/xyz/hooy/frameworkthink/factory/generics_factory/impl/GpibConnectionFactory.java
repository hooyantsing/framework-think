package xyz.hooy.frameworkthink.factory.generics_factory.impl;

import xyz.hooy.frameworkthink.factory.generics_factory.ConnectionFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GpibConnectionFactory implements ConnectionFactory<GpibMockConnection> {

    private final static Pattern pattern = Pattern.compile("GPIB(?<board>\\d+)::(?<primary>\\d+)::INSTR");

    @Override
    public boolean isConnectable(String visaString) {
        return pattern.matcher(visaString).matches();
    }

    @Override
    public GpibMockConnection fromVisaString(String visaString) {
        Matcher matcher = pattern.matcher(visaString);
        if (!matcher.find()) {
            throw new IllegalArgumentException(GpibConnectionFactory.class.getName() + " cannot parse [" + visaString + "].");
        }
        int board = Integer.parseInt(matcher.group("board"));
        int primary = Integer.parseInt(matcher.group("primary"));
        return new GpibMockConnection(board, primary);
    }

    @Override
    public String toVisaString(GpibMockConnection connect) {
        int board = connect.getBoard();
        int primary = connect.getPrimary();
        return "GPIB" + board + "::" + primary + "::INSTR";
    }
}
