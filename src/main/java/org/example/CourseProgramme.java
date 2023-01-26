package org.example;

import java.util.ArrayList;
import org.joda.time.*;

public class CourseProgramme {
//some changes

    private String courseName;
    private int courseId;
    private ArrayList<Module> moduleAvailable = new ArrayList<>();
    private ArrayList<Student> studentsEnrolled = new ArrayList<>();

    private DateTime startDate = new DateTime(2022,9,5,9,0);
    private DateTime finishDate = new DateTime(2023,5,16,0,0);

    public CourseProgramme(String courseName, int id) {
        setCourseId(id);
        setCourseName(courseName);
    }

    @Override
    public String toString() {
        return courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Module> getModuleAvailable() {
        return moduleAvailable;
    }

    public void setModuleAvailable(Module moduleAvailable) {
        this.moduleAvailable.add(moduleAvailable);
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(Student studentsEnrolled) {

        this.studentsEnrolled.add(studentsEnrolled);
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(DateTime finishDate) {
        this.finishDate = finishDate;
    }
}
