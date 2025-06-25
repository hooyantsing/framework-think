package xyz.hooy.frameworkthink.observer;

public class TestCase {

    public static void main(String[] args) {
        TvStation tvStation = new TvStation();
        tvStation.addEventListener(WeatherEvent.class, new User());
        WeatherStation weatherStation = new WeatherStation(tvStation);
        weatherStation.working();
    }
}
