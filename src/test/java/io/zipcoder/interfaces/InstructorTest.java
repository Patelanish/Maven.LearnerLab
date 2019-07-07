package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(10, "Roshni");

        boolean actual = instructor instanceof Teacher;

        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(100, "Roshni");

        boolean actual = instructor instanceof Person;

        Assert.assertTrue(actual);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(100, "Roshni");
        Student student = new Student(1000);
        double expected = 10000;

        instructor.teach(student, expected);
        double actual = student.gettotalStudyTime();

        Assert.assertEquals(expected, actual, 10000);
    }

    @Test
    public void testLecture() {

        Student student = new Student(1);
        Student student1 = new Student(2);
        Instructor instructor = new Instructor(3, "Roshni");
        Double expected = 0.0;

        Learner[] array = new Learner[2];
        array[0] = student;
        array[1] = student1;

        instructor.lecture(array,4.0);
        Double actual = student.gettotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}