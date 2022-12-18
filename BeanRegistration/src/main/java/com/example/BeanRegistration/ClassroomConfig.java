package com.example.BeanRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;

public class ClassroomConfig {
   @Bean
   @DependsOn({"instructors", "students"})
   public Classroom currentCohort(ArrayList<Instructors> instructors, ArrayList<Students> students) {
       return new Classroom(instructors, students);
   }
   @Bean
   @DependsOn({"instructors", "previousStudents"})
   public Classroom previousCohort(ArrayList<Instructors> instructors, ArrayList<Students> previousCohort) {
       return new Classroom(instructors, previousCohort);
   }
}
