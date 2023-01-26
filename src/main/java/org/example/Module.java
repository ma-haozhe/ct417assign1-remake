package org.example;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private int ModuleId;
    private ArrayList<Student> noOfStudents= new ArrayList<>();
    private ArrayList<CourseProgramme> associatedCourses= new ArrayList<>();
    private Lecturer lecturerResponsible;

    @Override
    public String toString() {
        return moduleName;
    }

    public Module(String moduleName, int moduleId) {
        setModuleName(moduleName);
        setModuleId(moduleId);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return ModuleId;
    }

    public void setModuleId(int moduleId) {
        ModuleId = moduleId;
    }

    public ArrayList<Student> getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(Student noOfStudents) {
        this.noOfStudents.add(noOfStudents);
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(CourseProgramme noOfAssociatedCourses){
        this.associatedCourses.add(noOfAssociatedCourses);
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
