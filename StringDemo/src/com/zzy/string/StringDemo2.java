package com.zzy.string;

import java.util.Scanner;
//将数组转换成[1,2,3,4,……]格式的字符串
public class StringDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println("输入数组：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arrToString(arr);
    }
    public static void arrToString(int[] arr){
        String str1 = "[";
        for (int i = 0; i < arr.length; i++) {
            str1 += arr[i];
            if(i < arr.length - 1){
                str1 += ",";
            }
        }
        str1 += "]";
        System.out.println(str1);
    }
}
