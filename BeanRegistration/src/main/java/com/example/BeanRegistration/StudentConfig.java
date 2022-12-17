package com.example.BeanRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(ArrayList<Student> currentCohort) {
        return new Students(currentCohort);
    }
    @Bean
    public Students previousStudents(ArrayList<Student> previousCohort) {
        return new Students(previousCohort);
    }
}
