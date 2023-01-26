package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

class StudentTest {
    private Student student = new Student("John Romero", new LocalDate(1969,3,26),1);
    private Student student1 = new Student("John Carmack", new LocalDate(1961,10,16),2);

    @Test
    void getId() {
        assertEquals(1, student.getId());
        assertEquals(2, student1.getId());
    }

    @Test
    void getUsername(){
        assertEquals("johnromero53", student.getUsername());
    }

    @Test
    void getName() {
        assertEquals("John Romero", student.getName());
    }

    @Test
    void getCourse() {
        CourseProgramme course1 = new CourseProgramme("Computer Science", 3);
        student.setCourses(course1);
        assertEquals("Computer Science", student.getCourse().getCourseName());
    }

    @Test
    void getAge() {
        assertEquals(53, student.getAge());
    }

    @Test
    void getModules() {
        Module module1 = new Module("Software Engineering 3", 4);
        Module module2 = new Module("Machine Learning", 5);
        student.setModules(module1);
        student.setModules(module2);

        assertEquals("[Software Engineering 3, Machine Learning]" , student.getModules().toString());
    }
    @Test
    void getDOB() {
        assertEquals(new LocalDate(1969,03,26), student.getDOB());
    }
}