package com.zzy.learn;

public class test {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("周志阳");
        s1.setAge(210);
        s1.setSex('男');
        s1.setMajor("软件工程");
        System.out.println(s1.getName()+" "+s1.getSex()+" "+s1.getAge()+" "+s1.getMajor());
    }
}
