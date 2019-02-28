package com.spring.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Data
public class Student {
    @Value("Tom")
    private String name;
    @Value("22")
    private int age;

    private Phone phone;

}
