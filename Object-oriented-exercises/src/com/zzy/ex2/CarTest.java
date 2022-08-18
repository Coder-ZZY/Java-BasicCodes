package com.zzy.ex2;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < cars.length; i++){
            cars[i] = new Car();
            System.out.printf("请输入第%d部汽车的信息：\n",i+1);
            System.out.println("品牌:");cars[i].setName(sc.next());
            System.out.println("价格:");cars[i].setPrice(sc.nextInt());
            System.out.println("颜色：");cars[i].setColor(sc.next());
        }
        //输出
        for (int i = 0; i < 3; i++){
            System.out.printf("第%d部汽车的信息为：\n",i+1);
            System.out.printf("品牌：%s",cars[i].getName());
            System.out.printf("价格：%d",cars[i].getPrice());
            System.out.printf("颜色：%s\n",cars[i].getColor());
        }
    }
}
