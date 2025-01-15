package xyz.hooy.frameworkthink.io.resource;

@FunctionalInterface
public interface ProtocolResolver {

    Resource resolve(String location, ResourceLoader resourceLoader);
}
