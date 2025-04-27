package xyz.hooy.frameworkthink.selfcare;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SelfcareObject {

    private final String name;
    private final Thread thread;
    private final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();

    public SelfcareObject(String name) {
        this.name = name;
        this.thread = new Thread(() -> {
            while (true) {
                try {
                    Runnable task = taskQueue.take();
                    task.run();
                } catch (InterruptedException ignored) {
                }
            }
        });
        thread.setName(name);
        this.thread.start();
    }

    public void eat() {
        taskQueue.add(() -> {
            System.out.println("eat");
        });
    }

    public void drink() {
        taskQueue.add(() -> {
            System.out.println("drink");
        });
    }

    public String getName() {
        return name;
    }
}
