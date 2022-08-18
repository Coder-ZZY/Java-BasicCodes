package com.zzy.StudentManageSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
/*        User test = new User("aaa","123","555","32343");
        user.add(test);*/
        Login_Menu(user);
    }
    public static void Login_Menu(ArrayList<User> user){
        while (true) {
            System.out.println("==================欢迎来到学生管理系统==================");
            System.out.println("=                                                     =");
            System.out.println("=                         0.退出                      =");
            System.out.println("=                         1.登录                      =");
            System.out.println("=                         2.注册                      =");
            System.out.println("=                       3.忘记密码                    =");
            System.out.println("=                                                     =");
            System.out.println("=======================================================");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择：");
            String i = sc.next();
            switch (i){
                case "0":   System.exit(0);System.out.println("bye");break;
                case "1":  Login(user);break;
                case "2":  Register(user);break;
                case "3":   forgetPassword(user);break;
                default:
                    System.out.println("没有这个选项请重新输入");
            }
        }
    }
    public static boolean Login(ArrayList<User> user){
        return true;
    }
    public static boolean Register(ArrayList<User> user){
        String username,id,password1,password2,phonenumber;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            username = sc.next();
            if(!checkUserName(username)) {System.out.println("用户名不合法，请重新输入");continue;}
            if(checkUnique(user,username))  break;
            else System.out.println("用户名已被注册，请重新输入。");
        }
        while (true){
            System.out.println("请输入身份证号码：");
            id = sc.next();
            if(checkID(id)) break;
            else System.out.println("身份证号码输入不合法，请重新输入。");
        }
        return true;
    }
    public static boolean   forgetPassword(ArrayList<User> user){
        return true;
    }
    public static boolean checkUnique(ArrayList<User> user,String checkname){
        for (int i = 0; i < user.size(); i++) {
            if(user.get(i).getUsername().equals(checkname)) return false;
        }
        return true;
    }
    //检查用户名长度及内容是否符合要求
    public static boolean checkUserName(String checkname){
        if(checkname.length() < 3 || checkname.length() > 15)  return false;
        else {
            int lettercnt = 0;
            for (int i = 0; i < checkname.length(); i++) {
                if((checkname.charAt(i) >= 'a'&&checkname.charAt(i) <= 'z') ||
                        (checkname.charAt(i) >= 'A'&&checkname.charAt(i) <= 'Z'))   lettercnt++;
                else if(!(checkname.charAt(i) >= '0' && checkname.charAt(i) <= '9'))  return false;
            }
            if(lettercnt == 0)  return false;
        }
        return true;
    }
    public static boolean checkID(String ID){
        if(ID.length() != 18) return false;
        else {
            if (ID.charAt(0) == '0')    return false;
            if (!(ID.charAt(17) == 'x' || ID.charAt(17) == 'X'))    return false;
            for (int i = 0; i < ID.length()-1; i++) {
                if(ID.charAt(i) < '0' || ID.charAt(i) > '9')  return false;
            }
            return true;
        }
    }
}
