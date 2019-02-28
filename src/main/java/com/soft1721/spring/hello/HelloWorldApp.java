package com.soft1721.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {
    public static void main(String[] args) {
//    读入xml文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
//        读取配置好的bean
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloworld");
//        运行HelloWorld的方法
        System.out.println(helloWorld.getHello());
    }
}
