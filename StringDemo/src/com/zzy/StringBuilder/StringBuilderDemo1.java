package com.zzy.StringBuilder;
/*StringBuilder应用场景：
1.字符串拼接
2.字符串反转*/
import java.util.Scanner;
//对称字符串判断+链式编程
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //链式编程，创建StringBuilder对象，在对象内添加字符串，然后将字符串反转，再将StringBuilder对象转换成String对象
        String result = new StringBuilder().append(str).reverse().toString();
        if(result.equals(str)) System.out.println("是对称字符串");
        else System.out.println("不是对称字符串");
    }
}
