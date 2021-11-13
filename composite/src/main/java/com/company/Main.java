package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Developer(1L,"Mahammad","Java Developer");
        Employee employee2 = new Manager(2L,"Test","Test");

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(employee1);
        directory.addEmployee(employee2);

        directory.showDetails();

    }
}
