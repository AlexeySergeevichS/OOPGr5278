package meteo;

import interfaces.iMeteoSensor;

//класс , сохраняющий данные датчика
public class MeteoStore {
    public boolean save(iMeteoSensor meteoSensor){
        System.out.format("Saving data from sensor [%d] at %s%n T - %f ; H - %f ; P - %f \n\r",
        meteoSensor.getId(),
        meteoSensor.getDateTime(),
        meteoSensor.getTemperature(),
        meteoSensor.getHumidity(),
        meteoSensor.getPressure());
        return true;
    }
}
