package com.zzy.learn;
public class student {
    private String name;
    private int age;
    private char sex;
    private String major;
    //age
    public void setAge(int age){
        if(age > 0 && age <= 100) this.age = age;
        else System.out.println("年龄不合法！");
    }
    public int getAge(){return age;}
    //sex
    public void setSex(char sex){
        if(sex == '男' || sex == '女')  this.sex = sex;
    else System.out.println("性别不合法！");
    }
    public char getSex(){return sex;}
    //name
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    //major
    public void setMajor(String major){this.major = major;}
    public String getMajor(){return major;}
}
