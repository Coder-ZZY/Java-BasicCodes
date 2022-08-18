package com.zzy.string;

import java.util.Scanner;
//分解字符串成数组
public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str1 = sc.next();
        System.out.println("字符串打印结果为：");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
    }
}
