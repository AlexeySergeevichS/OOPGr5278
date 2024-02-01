package interfaces;

import java.time.LocalDateTime;

public interface iMeteoSensor {
    int getId();// идентификатор датчика
    Float getTemperature(); // темп датчика
    Float getHumidity(); // влажность датчика
    Float getPressure(); // давление датчика
    LocalDateTime getDateTime(); // время чтения данных датчика]
}
