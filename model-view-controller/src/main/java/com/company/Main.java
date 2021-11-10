package com.company;

import com.company.controller.StudentController;
import com.company.model.Student;
import com.company.view.StudentView;

public class Main {

    public static void main(String[] args) {

        var student = new Student(1L,"Mahammad","Eminov");
        var view = new StudentView();

        var controller = new StudentController(student,view);
        controller.updateView();

        student.setId(2L);
        student.setName("Test");
        student.setSurname("Test");

        controller.updateView();
    }
}
