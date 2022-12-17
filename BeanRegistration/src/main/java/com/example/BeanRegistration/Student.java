package com.example.BeanRegistration;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }
}
