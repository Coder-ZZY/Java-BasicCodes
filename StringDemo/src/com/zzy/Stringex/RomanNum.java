package com.zzy.Stringex;

import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小于等于九位的数字字符串：");
        String str;
        while (true) {
            str = sc.next();
            if(CheckStr(str))  {
                System.out.println("输入合法");break;}
            else System.out.println("输入不合法，请重新输入");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(NumberIndex(str.charAt(i)));
        }
        System.out.println(sb);
    }
    public  static Boolean CheckStr(String str){
        if(str.length() > 9)    return false;
        else{
            for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)> '0' && str.charAt(i) <= '9')  continue;
            else return false;
            }
            return true;
        }
    }
    public static String NumberIndex(char c){
        switch (c){
            case '1':   return "Ⅰ";
            case '2':   return "Ⅱ";
            case '3':   return "Ⅲ";
            case '4':   return "Ⅳ";
            case '5':   return "Ⅵ";
            case '6':   return "Ⅵ";
            case '7':   return "Ⅶ";
            case '8':   return "Ⅷ";
            case '9':   return "Ⅸ";
            default:    return " ";
        }
    }
}
