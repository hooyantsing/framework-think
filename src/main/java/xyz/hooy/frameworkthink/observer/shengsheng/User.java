package xyz.hooy.frameworkthink.observer.shengsheng;

/**
 * 事件消费者
 */
public class User implements BasicEventListener {

    @Override
    public void onEvent(BasicEvent event) {
        if (event instanceof WeatherEvent weatherEvent) {
            System.out.println("现在是" + weatherEvent.getSource());
        }
    }
}
