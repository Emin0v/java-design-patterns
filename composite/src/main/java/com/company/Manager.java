package com.company;

public class Manager implements Employee {

    private final Long id;
    private final String name;
    private final String position;

    public Manager(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}');
    }


}
