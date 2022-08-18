package com.zzy.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("华为",5000);
        Phone p3 = new Phone("苹果",8000);
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        ArrayList<Phone> pp = getPhonesInfo(phones);
        for (int i = 0; i < pp.size(); i++) {
            System.out.printf("%s,%.0f",pp.get(i).getBrand(),pp.get(i).getPrice());
            System.out.println(pp.get(i).getBrand()+","+pp.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> getPhonesInfo(ArrayList<Phone> p){
        ArrayList<Phone> pp = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) {
            if(p.get(i).getPrice() < 3000)   pp.add(p.get(i));
        }
        return pp;
    }
}
