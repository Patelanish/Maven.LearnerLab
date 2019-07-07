package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(0);
        // When
        boolean actual = student instanceof Learner;
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(10);
        //When
        Boolean actual = student instanceof Person;
        //Then
        Assert.assertTrue(actual);

    }
    @Test
    public void testLearn(){
        //Given
        Student student = new Student(100);
        double expected = 0;

        // When
        student.learn(expected);
        double actual = student.gettotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 1000);
    }
}