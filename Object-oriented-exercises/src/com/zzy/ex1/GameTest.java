package com.zzy.ex1;

import java.util.Random;
//对象进行攻击方法
public class GameTest {
    public static void main(String[] args) {
        Character c1 = new Character("计晴云",100);
        Character c2 = new Character("周志阳",100);
        Random r = new Random();
        while (c1.getHeath() != 0 && c2.getHeath() != 0)
        {
            boolean flag = r.nextBoolean();
            if(flag)
                c1.attack(c2);
            else c2.attack(c1);
        }

    }
}
