package com.zzy.learn2;

public class User {
    private String UserName;
    private String Password;
    private String Email;
    private char Sex;
    private int Age;
    //空参构造方法
    public User(){}
    //全部参数构造方法
    public User(String UserName,String Password,String Email,char Sex, int Age){
        this.UserName = UserName; this.Password = Password; this.Email = Email; this.Sex = Sex; this.Age = Age;
    }
    //get and set 方法
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    public String getUserName(){
        return UserName;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char Sex) {
        this.Sex = Sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
}
