package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {

    Student Henry;

    @Before
    public void setup(){
        Henry = new Student(10);
        Henry.setName("Henry");
    }


    @Test
    public void testAdd(){
        List<Student> expected = new ArrayList<Student>();
        Student people = Student.getInstance();
    }


}