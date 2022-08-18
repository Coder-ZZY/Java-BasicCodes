package com.zzy.ArrayList;

public class Student {
    private String Name;
    private String Gender;

    public Student() {
    }

    public Student(String name, String gender) {
        Name = name;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
