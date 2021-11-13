package com.company;

public class Developer implements Employee{

    private final Long id;
    private final String name;
    private final String position;

    public Developer(Long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}');
    }
}
