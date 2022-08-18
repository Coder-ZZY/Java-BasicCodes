package com.zzy.string;

import java.util.Scanner;
//金额变大写字符串
public class StringDemo3 {
    public static void main(String[] args) {
        String[] info = {"零","佰","零","拾","零","万","零","仟","零","佰","零","拾","零","元"};
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999)  break;
            else System.out.println("输入金额有误，请重新输入.");
        }
    for (int i = 0;money!=0; i++){
        int number = money % 10;
        info[12- 2*i] = getCapitalNumber(number);
        money /= 10;
    }
    for (int i = 0; i < info.length; i++) {
            System.out.print(info[i]);
        }
    }
    public static String getCapitalNumber(int number){
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return str[number];
    }
}
