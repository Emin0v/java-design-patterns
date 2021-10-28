package com.company;

import java.math.BigDecimal;

public class User implements Prototype{

    private int id;
    private String name;
    private BigDecimal salary;

    public User(){
        System.out.println("User no args constructor");
    }

    public User(int id, String name, BigDecimal salary){
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("User all args constructor");

    }

    @Override
    public Prototype getClone() {
        return new User(id,name,salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
