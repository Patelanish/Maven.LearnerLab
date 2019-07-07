package io.zipcoder.interfaces;

public class Person {


    private static long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(long i) {

    }

    public static long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
