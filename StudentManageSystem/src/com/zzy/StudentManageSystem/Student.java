package com.zzy.StudentManageSystem;

public class Student {
    private String stu_id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String stu_id, String name, int age, String address) {
        this.stu_id = stu_id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return stu_id
     */
    public String getStu_id() {
        return stu_id;
    }

    /**
     * 设置
     * @param stu_id
     */
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
