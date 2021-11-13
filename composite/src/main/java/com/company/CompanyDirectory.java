package com.company;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showDetails() {
         employeeList.forEach(Employee::showDetails);
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void deleteEmployee(Employee emp){
        employeeList.add(emp);
    }
}
