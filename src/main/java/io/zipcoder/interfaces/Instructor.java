package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    private static final String name ="" ;

    public Instructor(long id, String roshni) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);


    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHourPerStudent = numberOfHours / learners.length;

        for(Learner learner : learners){
            learner.learn(numberOfHourPerStudent);
        }

    }
}
