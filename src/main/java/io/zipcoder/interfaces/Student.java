package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    public static Student getInstance;
    public double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public Student(long id) {
        super(id);
    }

    public static Student getInstance() {
        return null;
    }


    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }

    public double leaner(double gettotalStudyTime) {
        return totalStudyTime;

    }

    public double gettotalStudyTime() {
        return 0;
    }
}
