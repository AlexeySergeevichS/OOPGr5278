package Client;

import java.util.Random;

import Interfaces.iPublisher;

// это компанияЮ которая нужд в сотрудниках, она будет давать команду агентству
public class Company {
    iPublisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    // компания работаетс определенным агентством
    public Company(iPublisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }

}