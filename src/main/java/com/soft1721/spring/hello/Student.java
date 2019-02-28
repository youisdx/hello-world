package com.soft1721.spring.hello;

public class Student {
    private String name;
    private int age;
    private Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
