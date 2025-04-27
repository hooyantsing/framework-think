package xyz.hooy.frameworkthink.factory.generics_factory;

public interface ConnectionFactory<T extends Connection> {

    boolean isConnectable(String visaString);

    T fromVisaString(String visaString);

    String toVisaString(T connect);
}
