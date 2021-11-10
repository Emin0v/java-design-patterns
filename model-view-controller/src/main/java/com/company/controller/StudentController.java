package com.company.controller;

import com.company.model.Student;
import com.company.view.StudentView;

public class StudentController {

    private final Student student;
    private final StudentView view;

    public StudentController(Student student, StudentView view){
        this.student = student;
        this.view = view;
    }

    public void setStudentId(Long id){
        this.student.setId(id);
    }

    public void setStudentName(String name){
        this.student.setName(name);
    }

    public void setStudentSurname(String surname){
        this.student.setSurname(surname);
    }

    public Long getStudentId(){
        return this.student.getId();
    }

    public String getStudentName(){
        return this.student.getName();
    }

    public String getStudentSurname(){
        return this.student.getSurname();
    }

    public void updateView(){
        this.view.displayStudent(this.student);
    }
}
