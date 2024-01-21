package services;

import domain.Employee;
import domain.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();

    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "разнорабочий");
        count++;
        employees.add(emp);
        sortByFIO();
    }
    public void sortByFIO(){
        PersonComparator<Employee> empComp = new PersonComparator<>();
        employees.sort(empComp);
    }
}
