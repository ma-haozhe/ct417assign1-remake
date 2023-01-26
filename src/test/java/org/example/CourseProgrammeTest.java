package org.example;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest {

    private CourseProgramme course1 = new CourseProgramme("Computer Science", 3);

    @Test
    void getCourseName() {
        assertEquals("Computer Science", course1.getCourseName());
    }

    @Test
    void getCourseId() {
        assertEquals(3, course1.getCourseId());
    }

    @Test
    void getModuleAvailable() {
        Module module1 = new Module("Physics", 12);
        Module module2 = new Module("Graphics and Images Processing", 35);
        course1.setModuleAvailable(module1);
        course1.setModuleAvailable(module2);

        assertEquals("[Physics, Graphics and Images Processing]", course1.getModuleAvailable().toString());
    }

    @Test
    void getStudentsEnrolled() {
        Student student1 = new Student("Jack Ripper", new LocalDate(1888,8,30),155);
        Student student2 = new Student("Ted Bundy", new LocalDate(1946,1,24),345);
        course1.setStudentsEnrolled(student1);
        course1.setStudentsEnrolled(student2);

        assertEquals("[Jack Ripper, Ted Bundy]", course1.getStudentsEnrolled().toString());
    }

    @Test
    void getStartDate() {
        assertEquals(new DateTime(2022,9,5,9,0), course1.getStartDate());
    }

    @Test
    void getFinishDate() {
        assertEquals(new DateTime(2023,5,16,0,0), course1.getFinishDate());
    }
}