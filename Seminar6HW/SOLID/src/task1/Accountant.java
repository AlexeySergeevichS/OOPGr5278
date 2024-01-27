package task1;

import java.util.List;

public class Accountant  {
    private List<Employee> emps;
    
    public int calculateNetSalary(int bS) {
        int tax = (int) (bS * 0.25);// calculate in otherway
        return bS - tax;
    } 
}