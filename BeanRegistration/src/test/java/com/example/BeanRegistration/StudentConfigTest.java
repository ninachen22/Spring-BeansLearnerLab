package com.example.BeanRegistration;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {
    @Autowired
    private StudentConfig studentConfig;

    @Test
    public void studConfigCurrentStudentsTest() {
        Student s1 = new Student(1, "Claus");
        Student s2 = new Student(2, "Madea");
        Student s3 = new Student(3, "Mark");

        ArrayList<Student> currentCohort = new ArrayList<>();
        currentCohort.add(s1);
        currentCohort.add(s2);
        currentCohort.add(s3);
//        System.out.println(currentCohort.toArray());
        int expected = 3;
        int actual = studentConfig.currentStudents(currentCohort).size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void studConfigPrevStudentsTest() {

    }
}
