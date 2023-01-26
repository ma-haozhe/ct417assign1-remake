package org.example;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

public class Lecturer {

    private String name;
    private LocalDate DOB;
    private int age;
    private int id;
    private ArrayList<Module> moduleTaught = new ArrayList<>();


    public Lecturer(String name, LocalDate DOB, int id) {
        setName(name);
        setId(id);
        setDOB(DOB);
        setAge(DOB);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        String username;
        username = getName().replaceAll("\\s+","")+getAge();
        return username.toLowerCase();
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(LocalDate DOB) {
        LocalDate currentDate = LocalDate.now();
        this.age = Years.yearsBetween(DOB, currentDate).getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Module> getCoursesTaught() {
        return moduleTaught;
    }

    public void setModuleTaught(Module moduleTaught) {

        this.moduleTaught.add(moduleTaught);
    }

    @Override
    public String toString() {
        return name;
    }
}
