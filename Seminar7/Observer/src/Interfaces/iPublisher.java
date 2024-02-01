package Interfaces;

public interface iPublisher {
void registerObserver(iObserver observer);
void removeObserver(iObserver observer);
void sendOffer(String nameCompany,int salary);    
}
