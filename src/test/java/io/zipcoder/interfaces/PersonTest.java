package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getId() {
        long expectedID = 0;

        Person person = new Person(expectedID);
        long ID = person.getId();

        Assert.assertEquals(expectedID, ID);

    }

    @Test
    public void setName() {
        Person person = new Person (100);
        String expectedName = "Eric";

        person.setName(expectedName);
        String Name = person.getName();

        Assert.assertEquals(expectedName, Name);


    }
}