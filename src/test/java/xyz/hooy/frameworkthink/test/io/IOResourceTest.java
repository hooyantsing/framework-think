package xyz.hooy.frameworkthink.test.io;

import org.junit.jupiter.api.Test;
import xyz.hooy.frameworkthink.io.resource.impl.FileSystemResource;
import xyz.hooy.frameworkthink.io.resource.Resource;

import java.io.IOException;

public class IOResourceTest {

    @Test
    void fileSystemResource() throws IOException {
        Resource resource = new FileSystemResource("/Users/huyq/Project/FrameworkThink/test/io/io.txt");
        System.out.println("Name: " + resource.getName());
        System.out.println("Description: " + resource.getDescription());
        System.out.println("URI: " + resource.getURI());
        System.out.println("ContentLength: " + resource.contentLength());
        System.out.println("\n");
        Resource relativeResource = resource.createRelative("../..");
        System.out.println("Name: " + relativeResource.getName());
        System.out.println("Description: " + relativeResource.getDescription());
        System.out.println("URI: " + relativeResource.getURI());
        System.out.println("ContentLength: " + relativeResource.contentLength());
    }
}
