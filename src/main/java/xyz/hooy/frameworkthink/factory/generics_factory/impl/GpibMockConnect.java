package xyz.hooy.frameworkthink.factory.generics_factory.impl;

import xyz.hooy.frameworkthink.factory.generics_factory.Connect;

public class GpibMockConnect implements Connect {

    private final int board;
    private final int primary;

    public GpibMockConnect(int board, int primary) {
        this.board = board;
        this.primary = primary;
    }

    @Override
    public void open() {
        System.out.println("Gpib(mock) is open.");
    }

    @Override
    public void close() {
        System.out.println("Gpib(mock) is close.");
    }

    @Override
    public boolean isConnect() {
        return false;
    }

    @Override
    public void write(String message) {
        System.out.println("Writing: " + message);
    }

    @Override
    public String read() {
        String message = "Hello";
        System.out.println("Reading: " + message);
        return message;
    }

    public int getBoard() {
        return board;
    }

    public int getPrimary() {
        return primary;
    }
}
