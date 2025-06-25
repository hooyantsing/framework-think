package xyz.hooy.frameworkthink.observer;

import java.util.Random;

/**
 * 事件生产者
 */
public class WeatherStation {

    private final Random random = new Random();

    private final TvStation tvStation;

    public WeatherStation(TvStation tvStation) {
        this.tvStation = tvStation;
    }

    public String getWeather() {
        return random.nextBoolean() ? "晴天" : "雨天";
    }

    public void working() {
        while (true) {
            String weather = getWeather();
            tvStation.publish(new WeatherEvent(weather));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
