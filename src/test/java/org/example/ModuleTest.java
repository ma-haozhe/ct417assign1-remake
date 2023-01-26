package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

class ModuleTest {

    private Module module1 = new Module("Advanced Professional Skills", 57);

    @Test
    void getModuleName() {
        assertEquals("Advanced Professional Skills", module1.getModuleName());
    }

    @Test
    void getModuleId() {
        assertEquals(57, module1.getModuleId());
    }

    @Test
    void getNoOfStudents() {
        Student student1 = new Student("Albert Newton",new LocalDate(1879,3,14),698);
        Student student2 = new Student("Isaac Einstein",new LocalDate(1642,12,25),234);

        module1.setNoOfStudents(student1);
        module1.setNoOfStudents(student2);

        assertEquals("[Albert Newton, Isaac Einstein]", module1.getNoOfStudents().toString());
    }

    @Test
    void getAssociatedCourses() {
        CourseProgramme course = new CourseProgramme("Computer Science",3);

        module1.setAssociatedCourses(course);

        assertEquals("[Computer Science]", module1.getAssociatedCourses().toString());
    }

    @Test
    void getLecturerResponsible() {
        Lecturer lecturer = new Lecturer("Tupac Shakur",new LocalDate(1971,7,16),88);
    }
}