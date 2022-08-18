package com.zzy.StudentManageSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        Student s1 = new Student("202024100401","aaa",18,"adsfasdfasdf");
        Student s2 = new Student("202024100402","bbb",20,"dfasdfafasfdfds");
        ArrayList<Student> s = new ArrayList<>();
        s.add(s1);s.add(s2);
        Menu(s);
    }

    //主菜单
    public static void Menu(ArrayList<Student> s) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========================欢迎来到学生管理系统==========================");
            System.out.println("=                                                                     =");
            System.out.println("=                             1.添加学生                               =");
            System.out.println("=                             2.删除学生                               =");
            System.out.println("=                             3.修改学生                               =");
            System.out.println("=                             4.查询学生                               =");
            System.out.println("=                             5.退出                                   =");
            System.out.println("=                                                                     =");
            System.out.println("========================================================================");
            System.out.print("请输入您的选择：");
            int i = sc.nextInt();
            switch (i){
                case 1: addStudent(s);break;
                case 2: delStudent(s);break;
                case 3: updateStudent(s);break;
                case 4: printStudent(s);break;
                case 5: System.exit(0);
            }
        }
    }
    //检查ID唯一性
    public static int checkID(ArrayList<Student> s,String checkID){
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i).getStu_id().equalsIgnoreCase(checkID)){
                return i;
            }
        }
        return -1;
    }
    //检查年龄合法性
    public static boolean checkAge(int age){
        if(age < 0 || age > 100)    return false;
        else return true;
    }
    //添加学生
    public static void addStudent(ArrayList<Student> s){
        System.out.println("添加学生");
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        String id;String name;int age;String address;
        while (true){
            System.out.println("请输入学生的ID:");
            id = sc.next();
            if(checkID(s,id) == -1){
                System.out.println("输入的学生ID已存在,请重新输入！");continue;
            }
            else student.setStu_id(id);break;}

            System.out.println("请输入学生姓名：");
            name = sc.next();
            student.setName(name);

        while (true){
            System.out.println("请输入学生年龄:");
            age = sc.nextInt();
            if(!checkAge(age)){
                System.out.println("输入的学生年龄不合法,请重新输入！");continue;
            }
            else {student.setAge(age);break;}
        }

        System.out.println("请输入学生地址:");
        address = sc.next();
        student.setAddress(address);
        s.add(student);
        System.out.println("学生信息录入成功");
    }
    //删除学生
    public static boolean delStudent(ArrayList<Student> s){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的ID：");
        String del_id = sc.next();
        int index = checkID(s,del_id);
        if(index == -1) {System.out.println("输入的ID不存在，请检查后重新输入");return false;}
        else {
            Student tmp = s.get(index);
            s.remove(index);
            System.out.println("删除的学生信息为");
            System.out.println("id\t\t\t\t姓名\t年龄\t家庭住址");
            System.out.println(tmp.getStu_id()+"\t"+tmp.getName()+"\t\t"+tmp.getAge()+"\t\t"+tmp.getAddress());
        }
        return true;
    }
    //修改学生信息
    public static boolean updateStudent(ArrayList<Student> s){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的ID：");
        String update_id = sc.next();String name;int age;String address;
        int index = checkID(s,update_id);
        if(index == -1) {System.out.println("输入的ID不存在，请检查后重新输入");return false;}
        else {
            Student tmp = new Student();
            tmp.setStu_id(update_id);
            System.out.println("请输入学生姓名：");
            name = sc.next();
            tmp.setName(name);

            while (true){
                System.out.println("请输入学生年龄:");
                age = sc.nextInt();
                if(!checkAge(age)){
                    System.out.println("输入的学生年龄不合法,请重新输入！");continue;
                }
                else {tmp.setAge(age);break;}
            }

            System.out.println("请输入学生地址:");
            address = sc.next();
            tmp.setAddress(address);
            s.set(index,tmp);
            System.out.println("学生信息修改成功");
        }
        return true;
    }
    //查询学生
    public static void printStudent(ArrayList<Student> s) {
        if (s.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询。");
        }
        else {
            System.out.println("id\t\t\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < s.size(); i++) {
                Student tmp = s.get(i);
                System.out.println(tmp.getStu_id()+"\t"+tmp.getName()+"\t\t"+tmp.getAge()+"\t\t"+tmp.getAddress());
            }
        }
    }
}