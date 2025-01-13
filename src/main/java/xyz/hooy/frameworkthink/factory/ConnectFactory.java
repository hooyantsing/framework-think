package xyz.hooy.frameworkthink.factory;

public interface ConnectFactory<T extends Connect> {

    boolean isConnectable(String visaString);

    T fromVisaString(String visaString);

    String toVisaString(T connect);
}
