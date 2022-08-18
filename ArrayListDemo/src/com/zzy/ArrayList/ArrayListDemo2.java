package com.zzy.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
/*        Student[] s = new Student[3];
        s[0] = new Student("张三",'男');
        s[1] = new Student("李四",'男');
        s[2] = new Student("王五",'女');*/
        System.out.println("输入学生个数：");
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            Student s = new Student();
            System.out.println("输入学生姓名:");
            s.setName(sc.next());
            System.out.println("输入学生2性别：");
            s.setGender(sc.next());
            studentArrayList.add(s);
        }
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student tmp = studentArrayList.get(i);
            System.out.println(tmp.getName()+","+tmp.getGender());
        }
    }
}
