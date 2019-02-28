package com.spring.annotation;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和Lombok开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("iphoneX")
    private String brand;
    @Value("2222")
    private double price;
}
