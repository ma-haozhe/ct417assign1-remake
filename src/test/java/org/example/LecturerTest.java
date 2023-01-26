package org.example;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    private Lecturer lecturer1 = new Lecturer("Daniel Radcliff", new LocalDate(1985,7,12),1);
    private Lecturer lecturer2 = new Lecturer("Michael Bacon", new LocalDate(1843,12,3),2);

    @Test
    void getDOB() {
        assertEquals(new LocalDate(1985,7,12), lecturer1.getDOB());
    }

    @Test
    void getCoursesTaught() {
        Module module1 = new Module("Discrete Maths", 1);
        Module module2 = new Module("Information Retrieval", 2);
        lecturer1.setModuleTaught(module1);
        lecturer1.setModuleTaught(module2);

        assertEquals("[Discrete Maths, Information Retrieval]" , lecturer1.getCoursesTaught().toString());
    }
    @Test
    void getId() {
        assertEquals(1, lecturer1.getId());
        assertEquals(2, lecturer2.getId());
    }

    @Test
    void getUsername(){
        assertEquals("danielradcliff37", lecturer1.getUsername());
    }

    @Test
    void getName() {
        assertEquals("Daniel Radcliff", lecturer1.getName());
    }

    @Test
    void getAge() {
        assertEquals(37, lecturer1.getAge());
    }
}