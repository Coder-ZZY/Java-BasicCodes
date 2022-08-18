package com.zzy.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        //增删改查
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("456");
        list.add("987");

        list.remove("123");
        list.remove(0);

        list.set(2,"789");

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
