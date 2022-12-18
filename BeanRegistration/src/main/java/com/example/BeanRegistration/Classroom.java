package com.example.BeanRegistration;

import java.util.ArrayList;

public class Classroom {
    ArrayList<Instructors> instructors;
    ArrayList<Students> students;
    Iterable<? extends Learner> students1;

    public Classroom(ArrayList<Instructors> instructors, ArrayList<Students> students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students1, numberOfHours);
    }
}
