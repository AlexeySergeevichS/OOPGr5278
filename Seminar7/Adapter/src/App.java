import interfaces.iMeteoSensor;
import interfaces.iSensorTemperature;
import meteo.Adapter;
import meteo.MeteoStore;
import sensors.MS200;
import sensors.ST500Info;

public class App {
    public static void main(String[] args) throws Exception {
        MeteoStore meteoDB = new MeteoStore();
        iMeteoSensor oldSensor = new MS200(1);
        meteoDB.save(oldSensor);

        iSensorTemperature nS = new ST500Info();
        Adapter adapSens = new Adapter(nS);
        meteoDB.save(adapSens);
        

        
    }
}
