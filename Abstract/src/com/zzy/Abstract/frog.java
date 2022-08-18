package com.zzy.Abstract;

public class frog extends Animal{
    public frog(){}
    public frog(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {

    }

    public String toString() {
        return "frog{}";
    }
}
