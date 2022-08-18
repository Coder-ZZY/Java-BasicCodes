package com.zzy.ex1;

import java.util.Random;
//游戏人物对象
public class Character {
    private String Name;
    private int Heath;

    //空参构造
    public Character() {
    }

    //全参构造
    public Character(String Name, int Heath) {
        this.Name = Name;
        this.Heath = Heath;
    }

    /**
     * 获取
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     *
     * @return Heath
     */
    public int getHeath() {
        return Heath;
    }

    /**
     * 设置
     *
     * @param Heath
     */
    public void setHeath(int Heath) {
        this.Heath = Heath;
    }

    public void attack(Character role) {
        /*伤害随机数为1-20*/
        Random r = new Random();
        int hurt = r.nextInt(30) + 1;
        if (role.Heath >= hurt) {
            role.setHeath(role.Heath - hurt);
            System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下" + "造成了" + hurt +
                    "点伤害," + role.getName() + "还剩下" + role.getHeath() + "点血量");
        } else {
            role.setHeath(0);
            System.out.println(this.getName() + "KO了" + role.getName() + "!!!");
        }
    }
}
