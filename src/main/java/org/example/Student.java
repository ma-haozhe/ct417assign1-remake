package org.example;

import org.joda.time.*;

import java.util.ArrayList;

public class Student {

    private String name;
    private LocalDate DOB;
    private int age;
    private int id;
    private ArrayList<Module> modules= new ArrayList<>();

    private CourseProgramme course;

    public Student(String name, LocalDate DOB,int id) {
        setId(id);
        setName(name);
        setDOB(DOB);
        setAge(DOB);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCourses(CourseProgramme course) {
        this.course = course;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setAge(LocalDate DOB) {
        LocalDate currentDate = LocalDate.now();
        this.age = Years.yearsBetween(DOB, currentDate).getYears();
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setModules(Module modules) {

        this.modules.add(modules);
    }

    public String getName() {
        return name;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public String getUsername() {
        String username;
        username = getName().replaceAll("\\s+","")+getAge();
        return username.toLowerCase();
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}
