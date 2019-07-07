package io.zipcoder.interfaces;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class StudentsSingleton {
    private static StudentsSingleton ourInstance = new StudentsSingleton();

    private StudentsSingleton(){
        Student Anish = new Student(1);
        Anish.setName("Anish");
        Student Fahim = new Student(2);
        Fahim.setName("Fahim");
        Student Rosh = new Student(3);
        Rosh.setName("Rosh");
        Student Rutu = new Student(4);
        Rutu.setName("Rutu");

        add(Anish);
        add(Fahim);
        add(Rosh);
        add(Rutu);

    }



    public static StudentsSingleton getInstance() {



        return ourInstance;
    }

}
