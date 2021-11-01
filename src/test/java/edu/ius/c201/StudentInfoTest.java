package edu.ius.c201;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentInfoTest {
    @Test
    public void getAndSetGrade() {
        double expected = 50;
        StudentInfo s = new StudentInfo(100.0, 10);
        s.setGrade(0, 50);
        double actual = s.getGrade(0);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getAndSetName() {
        String expected = "foo";
        StudentInfo s = new StudentInfo(100.0, 10);
        s.setName(0, expected);
        String actual = s.getName(0);
        assertEquals(expected, actual);
    }

    @Test
    public void getGradeByName() {
        double expected = 10.5;
        String name = "foo";
        StudentInfo s = new StudentInfo(100.0, 10);
        s.setName(8, "foo");
        s.setGrade(8, expected);
        double actual = s.getGradeByName("foo");
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void setGradeByName() {
        double expected = 65.5;
        String name = "foo";
        StudentInfo s = new StudentInfo(100.0, 10);
        s.setName(5, name);
        s.setGradeByName(name, expected);
        double actual = s.getGrade(5);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void numBestGrades() {
        int expected = 5;
        StudentInfo s = new StudentInfo(100.0, 10);
        for (int i = 0; i < 10; i++) {
            s.setName(i, "Student"+i);
            s.setGrade(i, i*10.0);
        }
        int actual = s.numBestGrades();
        assertEquals(expected, actual);
    }

    @Test
    public void findBestStudents() {
        String[] expected = {"Student5","Student6","Student7","Student8","Student9"};
        StudentInfo s = new StudentInfo(100.0, 10);
        for (int i = 0; i < 10; i++) {
            s.setName(i, "Student"+i);
            s.setGrade(i, i*10.0);
        }
        String[] actual = s.findBestStudents();
        assertArrayEquals(expected, actual);
    }
}