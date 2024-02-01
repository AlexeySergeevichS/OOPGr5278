package interfaces;

public interface iSensorTemperature {
    int identifier();// id датчика
    double temperature();// темп датчика
    int year();// год
    int day(); // день года
    int second(); // секунда дня
}
