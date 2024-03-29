package sensors;

import java.time.LocalDateTime;

import interfaces.iSensorTemperature;

public class ST500Info implements iSensorTemperature {

    @Override
    public int identifier() {
        return 100;
    }

    @Override
    public double temperature() {
        return 22.0;
    }

    @Override
    public int year() {
        return LocalDateTime.now().getYear();
    }

    @Override
    public int day() {
        return LocalDateTime.now().getDayOfYear();
    }

    @Override
    public int second() {
        LocalDateTime n = LocalDateTime.now();
        return n.getHour() * 3600 + n.getMinute() * 60 + n.getSecond();
    }

}
