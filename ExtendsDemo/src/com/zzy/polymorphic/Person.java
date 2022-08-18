package com.zzy.polymorphic;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
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
/*    //饲养狗方法
    public void keepPet(Dog d,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
        d.eat(something);
    }
    //饲养猫方法
    public void keepPet(Cat c,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
        c.eat(something);
    }*/
    public void keepPet(Animal a,String something){
        if(a instanceof Dog){
            Dog d = (Dog)a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
        }
        else if(a instanceof Cat){
            Cat c = (Cat)a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
            c.eat(something);
        }
    }

}
