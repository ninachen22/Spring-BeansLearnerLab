package com.example.BeanRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

public class InstructorsConfig {
    @Bean(name = "instructors")
    @Primary
    public Instructors instructorsZcw(ArrayList<Instructor> instructors) {
        return new Instructors(instructors);
    }
    @Bean
    public Instructors tcUsaInstructors(ArrayList<Instructor> tcUsaInstructors) {
        return new Instructors(tcUsaInstructors);
    }
    @Bean
    public Instructors tcUkInstructors(ArrayList<Instructor> tcUkInstructors) {
        return new Instructors(tcUkInstructors);
    }
}
