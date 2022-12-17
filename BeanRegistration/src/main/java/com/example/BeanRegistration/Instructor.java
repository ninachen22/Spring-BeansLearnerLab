package com.example.BeanRegistration;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int numOfLearners = 0;
        for (Learner l : learners) {
            numOfLearners++;
        }
        double numberOfHoursPerLearner = numberOfHours / numOfLearners;
        for (Learner l : learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}
