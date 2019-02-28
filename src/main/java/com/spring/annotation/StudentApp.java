package com.spring.annotation;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Data
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(StudentApp.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
