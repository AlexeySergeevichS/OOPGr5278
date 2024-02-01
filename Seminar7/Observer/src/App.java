import Client.Company;
import Interfaces.iObserver;
import Interfaces.iPublisher;
import Manager.JobAgency;
import Observers.Junior;
import Observers.Master;
import Observers.Student;

public class App {
    public static void main(String[] args) throws Exception {
        iPublisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency,"Google",50);
        Company gb = new Company(jobAgency,"GeekBrains",100);

        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");
        Student petrov = new Student("Petrov");
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);

for (int i = 0; i < 5; i++) {
    google.needEmployee();
    gb.needEmployee();
}



    }
}
